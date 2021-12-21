import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {
            int temp = keyboard.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not a Number");
        }
    }
    
}
