import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        double ftemp;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit temperature: ");
        ftemp=keyboard.nextDouble();
        Temperature temperature = new Temperature(ftemp);
        temperature.show_results();
    }
}
