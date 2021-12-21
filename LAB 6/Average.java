import java.util.Scanner;

public class Average {
    private int[] data = new int[5];
    private double mean;
    public Average()
    {
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0;i<data.length;i++)
        {
            System.out.println("Enter Data"+(i+1));
            data[i]=keyboard.nextInt();
        }
        this.mean = mean();
        selectionSort();
    }
    public double mean()
    {
        double answer = 0;
        
        for(int i=0;i<data.length;i++)
        {
            answer+=data[i];
        }
        return answer/data.length;

    }
    public void selectionSort()
    {
        System.out.println("test sort");
        for (int i = 0; i < data.length-1; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[min]) {
                    min = j;
                }
            }
            // Swapping i-th and min-th elements
            int swap = data[min];
            data[min] = data[i];
            data[i] = swap;
        }
    }

    @Override
    public String toString() {
        String result;
        String dec = "";

        for (int i = 0; i < data.length; i++){
            dec = dec + data[i] + " ";
        }
        result =  "Decending order: " + dec + "\nmean = " +  mean;

        return result;
    }
    public double getMean()
    {
        return this.mean;
    }



    
}
