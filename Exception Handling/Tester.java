import java.io.IOException;

public class Tester {
    public static void main(String[] args)

    {
       Employee emp =null;

       try {
           emp = new Employee("name", 17, "353654");
           EmployeeWriter write = new EmployeeWriter();

        write.openFile("test.dat");
        write.writeinFile(emp);
        write.close();
       } catch (AgeException e) {
           System.out.println(e.getMessage());
       }

        
    }
    
}
