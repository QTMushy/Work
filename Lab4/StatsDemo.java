import java.util.Scanner;
import java.io.*;// TASK #3 Add the file I/O import statement here
import java.text.DecimalFormat;


/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main(String[] args)
   throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference
      DecimalFormat threeDecimal = new DecimalFormat("0.000");

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      // ADD LINES FOR TASK #4 HERE
      FileWriter fw = new FileWriter("Results.txt");
      PrintWriter pw = new PrintWriter(fw);
      FileReader fr = new FileReader(filename);// Create a FileReader object passing it the filename
      BufferedReader br = new BufferedReader(fr);// Create a BufferedReader object passing FileReader
      // object
      line = br.readLine();// Perform a priming read to read the first line of
      // the file
      while(line!=null)// Loop until you are at the end of the file
      {
         double temp = Double.parseDouble(line);// Convert the line to a double value and add the
         count++;// Increment the counter
         sum+=temp;//add to the sum
         line = br.readLine();// Read a new line from the file
      }
      mean=sum/count;// Store the calculated mean
      
      
    
      fr.close();// Close the input file
      br.close();
      sum=0;
      count=0;
      // ADD LINES FOR TASK #5 HERE
      
      FileReader fr1 = new FileReader(filename);// Reconnect FileReader object passing it the
      BufferedReader br1 = new BufferedReader(fr1);      // Reconnect BufferedReader object passing

      line = br1.readLine();      // Perform a priming read to read the first line of

      while(line!=null)      // Loop until you are at the end of the file

      {
         double temp = Double.parseDouble(line);      // Convert the line into a double value and

        difference=temp-mean;//subtract the mean
        sum+=(difference*difference);//adding square of difference
        count++;//count increment
        line=br1.readLine();//read next line
      }
      stdDev=Math.sqrt(sum/count);//calculating std deviation
      fr1.close();//closing filereader object
      br1.close();
      pw.println(threeDecimal.format(mean));//writing mean in output file
      pw.println(threeDecimal.format(stdDev));//writing std deviation in output file
      pw.close();//closing output file

   }
}