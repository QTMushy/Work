import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeWriter {

    public String Filename;
    FileOutputStream file;
    ObjectOutputStream write;

    public void openFile(String Filename)
    {
        try {
            this.Filename = Filename;
            file = new FileOutputStream(this.Filename);
            write = new ObjectOutputStream(file);

        } catch (Exception e) {
            System.out.println("cannot write");
        }
    }

    public void writeinFile(Employee input)
    {try {
        write.writeObject(input);
        
    } catch (IOException e) {
        System.out.println("Error");
    }}
    
    public void close()
    {try
    {
        file.close();
        write.close();
    }
    catch(IOException e)
    {
        System.out.println("error");
    }
    }
}
