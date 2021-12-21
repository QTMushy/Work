public class RainFallDemo {
    public static void main(String[] args) {
        Rainfall test = new Rainfall();//initializing an object of rainfall class
        double []inp = {1.6,2.1,1.7,3.5,-2.6,3.7,3.9,2.6,2.9,4.3,2.4,3.7};//array which stores rainfall per month
        test.getInput(inp);
        System.out.printf("The total rainfall for this year is %.1f", test.totalRainFall()); 
        System.out.println();
        System.out.println("The average rainfall for this year is " + test.averageRainFall());

        double rainfall = inp[test.maximumRainFall() - 1];
        if(rainfall < 0) rainfall = 0;
        System.out.println("The month with the highest amount of rain is " + test.maximumRainFall() + " with " + rainfall + " inches.");
        rainfall = inp[test.minimumRainFall() - 1];
        if(rainfall < 0) rainfall = 0;
        System.out.println("The month with the lowest amount of rain is " + test.minimumRainFall() + " with " + rainfall + " inches.");
    }
}
