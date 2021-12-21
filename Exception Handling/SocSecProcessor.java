import java.util.Scanner;

public class SocSecProcessor {
    public static boolean isvalid(String number)throws SocSecException
    {
        if(number.length()!=11)
        {
            throw new SocSecException("Wrong Number of Characters");
        }
        if(number.charAt(3)!='-'||number.charAt(6)!='-')
        {
            throw new SocSecException("Dashes at wrong position");
        }
        for(int i =0;i<number.length();i++)
        {
            if(i==3||i==6)
            {
                continue;
            }
            else
            {
                if(!Character.isDigit(number.charAt(i)))
                {
                    throw new SocSecException("Character that is not a digit");
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char ans ='Y';
        Scanner keyboard = new Scanner(System.in);
        while(ans=='Y')
        {

        try {
           
            
            System.out.println("Name?");
            String name = keyboard.nextLine();
            System.out.println("SSN?");
            String ssn = keyboard.nextLine();
            if(isvalid(ssn))
            {
                System.out.println(name + " "+ssn+" is valid");

            }
        } 
        catch (SocSecException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Do you want to continue?");
        ans = Character.toUpperCase(keyboard.nextLine().charAt(0));
    }
        
    }
}
    

