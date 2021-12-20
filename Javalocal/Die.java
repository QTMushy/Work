import java.util.Random;

public class Die {
    private int sides = 6;
    private int top_val;
    Random random = new Random();
    public int roll(){
        this.top_val=random.nextInt(6)+1;
        return top_val;
    }
    
}
