import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
public class Airport {
	private Queue<String> landingQueue;
	private Queue<String> takeoffQueue;
	private ArrayList<String> log;

	public Airport() {
		landingQueue = new LinkedList<String>();
		takeoffQueue = new LinkedList<String>();
		log = new ArrayList<String>();
	}

	public void addTakeOff(String plane) {
		takeoffQueue.add(plane);
	}

	public void addLanding(String plane) {
		landingQueue.add(plane);
	}

	public String handleNextAction(){
		if(takeoffQueue.isEmpty()&&landingQueue.isEmpty())
		{
			return "No planes waiting for take off or Landing";
		}
		else
		{
			if(landingQueue.isEmpty())
			{
				String temp = takeoffQueue.poll();
				this.log.add("Flight " + temp + " taken off.");
				return "Flight " + temp + " is Taking off";
			}
			else
			{
				String temp = landingQueue.poll();
				this.log.add("Flight " + temp + " landed.");
				return "Flight " + temp + " is Landing";
			}

		}
	}

	public String waitingPlanes()
	{
		String waiting = "";

		if(landingQueue.isEmpty()&&takeoffQueue.isEmpty())
		{
			return "No plane is in the landing and take-off queues.";
		}

		else
		{
			if(!takeoffQueue.isEmpty())
			{
				waiting+="Planes waiting for take-of\n";
            	waiting+="---------------------------\n";
				Iterator<String> itr = takeoffQueue.iterator();
				while(itr.hasNext())
				{
					String temp = itr.next();
					waiting+=temp+"\n";
				}

			}
			
			if(!landingQueue.isEmpty())
			{
				waiting+="Planes waiting for landing:\n";
				waiting+="----------------------------\n";

				Iterator<String> itr = landingQueue.iterator();
				while(itr.hasNext())
				{
					String temp = itr.next();
					waiting+=temp+"\n";
				}
			}

			
		}

		return waiting;
	}

	public String log()
	{
		if(log.isEmpty())
		{
			return "No activity available";
		}
		else
		{
			System.out.println("List of the landing/take-off activities\n");
            System.out.println("---------------------------------------\n");
			String output = "";
			Collections.reverse(log);
			for(int i=0;i<log.size();i++)
			{
				output += log.get(i) + "\n";
			}
			Collections.reverse(log);
			return output;
		}

	}
	public void log(String p){
        FileOutputStream f = null;
        try {
            f = new FileOutputStream(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        DataOutputStream d = new DataOutputStream(f);
        try {
			d.writeUTF(this.log());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	
}
