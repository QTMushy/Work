import java.util.Arrays;
/**
 * The following is a class which stores the amount of rainfall in an year
 * 
 */
public class Rainfall {
    private double[] arr = new double[12];//to store rainfall of every month
    /**
     * the function makes a copy of the user input array
     * @param array
     */

    public void getInput(double []array){
        arr = Arrays.copyOf(array,12);
    }
    /**
     * Function finds othe total rainfall in the given year
     * 
     * @return total rainfall
     */
    public double totalRainFall(){
        double sum = 0;
        for (int i =0;i<arr.length;i++) {
            if(arr[i]>0)
                sum += arr[i];
        }
        if(sum < 0) return 0;
        return sum;
    }
    /**
     * Function finds out the average rainfalll in the given year
     * 
     * @return average rainfall
     */

    public double averageRainFall(){
        double sum = totalRainFall();
        return sum / 12;
    }
    /**
     * Function finds out the month with highest rainfall in the given year
     * 
     * @return month of maximum rainfall
     */

    public int maximumRainFall(){
        int maxRainFallMonth = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[maxRainFallMonth]<arr[i]){
                maxRainFallMonth = i;
            }
        }
        return maxRainFallMonth + 1;
    }
    /**
     * Function finds out the month with minimum rainfall in the given year
     * 
     * @return month of minimum rainfall
     */
    public int minimumRainFall(){
        int minRainFallMonth = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[minRainFallMonth]>arr[i]){
                minRainFallMonth = i;
            }
        }
        return minRainFallMonth + 1;
    }
    
    
}
