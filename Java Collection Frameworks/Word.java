import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Word {

    public static void main(String[] args) {
        String line = "my name is shubham malhotra i am called as shubham malhotra map banana hai mujhe ";


        String[] tok = line.split(" ");

        Map<Character,Set<String>> dict = new HashMap<>();

        for(int i =0;i<tok.length;i++)
        {
            if(dict.containsKey(tok[i].charAt(0)))
            {
                dict.get(tok[i].charAt(0)).add(tok[i]);
            }
            else
            {
                dict.put(tok[i].charAt(0),new HashSet<>());
                dict.get(tok[i].charAt(0)).add(tok[i]);

            }
        }

        System.out.println(Collections.singletonList(dict));
    }
    
}
