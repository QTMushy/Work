import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int getKth(int lo, int hi, int k) {
        int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = lo;i<=h1;i++)
        {
            count=0;
            while(i!=1)
            {
                if(i%2==0)
                {
                    i = i/2;
                    count++;
                }
                else
                {
                    i = 3*i+1;
                    count++;
                }
            }
            list.add(count);
        }

        Collections.sort(list); 
        
        return list.get(k);
    }
}