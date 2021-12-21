import java.util.ArrayList;

public class Triangle extends Shape {

    ArrayList<Double> sides;

    public Triangle(ArrayList<Double> sides)
    {
        this.sides.add(sides.get(0));
        this.sides.add(sides.get(1));
        this.sides.add(sides.get(2));

    }

    public double getarea()
    {
        return sides.get(0)+sides.get(1)+sides.get(2);
    
}
}
