import java.io.IOException;
import java.io.PrintWriter;

public class Inputtxt{
    public static void main(String[] args)
    throws IOException
     {
        PrintWriter outputFile = new PrintWriter("Student.txt");
        outputFile.println("chris");
        outputFile.println("shubham");
        outputFile.close();

    }
}