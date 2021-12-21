public class Circle extends Shape implements Comparable{
double radius;

public Circle(double radius)
{
    this.radius = radius;
}

public double getarea()
{
    this.area = 3.14*this.radius*this.radius;
    return area;
}

public int compareTo(Object input)
{
   try
    { Circle temp = (Circle) input;
        if(this.radius==temp.radius)
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
        
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());
        return -1;
    }
    
}

}
