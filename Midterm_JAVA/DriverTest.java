
import java.util.Scanner;

public class DriverTest {
    public static void main(String[] args) {
        DriverExam student = new DriverExam();
        Scanner kb = new Scanner(System.in);
        System.out.println("Input answer for the student");
        for(int i =1 ; i<=10 ; i++)
        {
            System.out.println("Question "+i+": ");
            char temp;
            char input;
            temp = kb.next().charAt(0);
            input=Character.toUpperCase(temp);
            while(!(input=='A'||input=='B'||input=='C'||input=='D'))
            {
            System.out.println("ERROR: Valid answers are A, B, C, or D.");
            System.out.println("Question "+(i)+": ");
            temp = kb.next().charAt(0);
            input=Character.toUpperCase(temp);
           
            
            }
            student.get_answers(input);

            
        }
        student.check();
        student.show_result();
        kb.close();
    }

    
}
