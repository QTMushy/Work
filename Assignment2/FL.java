import java.util.ArrayList;
import java.util.Scanner;

public class FL {
    private ArrayList<Person> f = new ArrayList<>();
    public void addf(String name)
    {
        f.add(new Person(name));

    }
    public FL copy()
    {
        FL copy = new FL();
        for(int i =0 ; i<f.size();i++)
        {
            copy.addf(f.get(i).getName());

        }
        return copy;
    }
    public void delete()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first name of the person you want to delete:");
        String fname = kb.nextLine();
        for (int i =0 ; i< f.size();i++)
        {
            if (fname.compareToIgnoreCase(f.get(i).getName())==0)
            {
                f.remove(i);
            }

        }


    }

    public void displaylist()
    {

        for (int i =0;i<f.size();i++)
        {
            System.out.println(f.get(i).getName());
        }
    }
   
    
    
}
