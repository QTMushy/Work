import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Output {
    public static void main(String[] args)
    throws IOException
    {
        File file = new File("Student.txt");
        Scanner input = new Scanner(file);
        System.out.println(input.nextLine());
        System.out.println(input.nextLine());
        System.out.println(input.nextLine());
        input.close();
    }
    
}
