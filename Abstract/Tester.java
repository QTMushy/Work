import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Shape shape  = new Circle(1);
        Shape shape2 = new Circle(0);

        Circle test = (Circle) shape;

        System.out.println(test.compareTo(shape2));
    }
}
