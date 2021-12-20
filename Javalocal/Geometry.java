import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
         print_menue();

         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();
               value = circleArea(radius);

               // TASK #3 Call the circleArea method and
               // store the result in the value variable

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value = rectangleArea(length,width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value = triangleArea(base, height);


               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value=circleCircumfrence(radius);

               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = rectanglePerimeter(length,width);

               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = trianglePerimeter(side1, side2, side3);

               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here
   public static void print_menue()
   {
       System.out.println("This is a geometry calculator");
       System.out.println("Choose what you would like to calculate");
       System.out.println("1. Find the area of a circle");
       System.out.println("2. Find the area of a rectangle");
       System.out.println("3. Find the area of a triangle");
       System.out.println("4. Find the circumference of a circle");
       System.out.println("5. Find the perimeter of a rectangle");
       System.out.println("6. Find the perimeter of a triangle");
       System.out.print("Enter the number of your choice:");
   }
   // TASK #2 Create the value-returning methods here
   /**
    * This function calculates the area of a circle
    * @param radius
    * @return area
    */
   public static double circleArea(double radius)
   {
      double area = 3.14*radius*radius;
       return area;
   }
   /**
    * This Function calculates and returns the area of a rectangle
    * @param l
    * @param b
    * @return area
    */
   public static double rectangleArea(double l,double b)
   {
      double area = l*b;
      return area;
   }
   /**
    * This Function calculates and return the area of triangle
    * @param b
    * @param h
    * @return area
    */
   public static double triangleArea(double b,double h)
   {
      double area = .5*b*h;
      return area;
   }
   /**
    * This function calculates and returns the circumfrence of a circle
    * @param r
    * @return circumfrence
    */
   public static double circleCircumfrence(double r)
   {
      double circumfrence =  2*3.14*r;
      return circumfrence;
   }
   /**
    * This Function calculates and returns the Perimeter of a rectangle
    * @param l
    * @param b
    * @return (2*l)+(2*b)
    */
  
   public static double  rectanglePerimeter (double l, double b)
   {
       return(2*l)+(2*b);
   }
   /**
    * This function calculates and returns the perimeter of a triangle
    * @param s1
    * @param s2
    * @param s3
    * @return s1+s2+s3
    */
   public static double trianglePerimeter(double s1,double s2,double s3)
   {
       return s1+s2+s3;
   }





   // TASK #4 Write javadoc comments for each method
}