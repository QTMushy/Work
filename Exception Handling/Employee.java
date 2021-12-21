import java.io.Serializable;

public class Employee implements Serializable,Comparable{
    public String name;
    public int age;
    public String ssn;
    public Employee(String name,int age,String ssn)throws AgeException
    {
       if(age>18||age<65)
       {
           throw new AgeException("Age Less Than 18 or More Than 65");

       }
       else
       {
           this.age = age;
       }
       this.name = name;
       this.ssn = ssn;
    }
    public int compareTo(Object input)
    {
        Employee temp = (Employee) input;
        if(this.name.equalsIgnoreCase(temp.name)&&this.ssn.compareTo(temp.ssn)==0&&this.age==temp.age)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    
}
