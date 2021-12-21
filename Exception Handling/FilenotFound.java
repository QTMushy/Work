import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class FilenotFound t{
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            Scanner input = new Scanner(file);
        } 
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
    
        }
        
    }
   
}