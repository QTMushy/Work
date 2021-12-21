import java.util.Comparator;

public class Persona2 {
    private String firstName;
    private String lastName;
    private String cellNumber;
    private String month;
    private int Date;

    public Persona2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Persona2(String firstName, String lastName, String cellNumber, String month, int date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellNumber = cellNumber;
        this.month = month;
        Date = date;
    }


    public Persona2(Persona2 input)

    {
        this.firstName= input.firstName;
        this.lastName=input.lastName;
        this.month= input.month;
        this.cellNumber=input.cellNumber;
        this.Date= input.Date;
    }
    public Persona2() {
        this.firstName="";
        this.lastName="";
        this.cellNumber="";
        this.month="";
        this.Date=0;


    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public String getFullName()
    {
        return getFirstName()+" "+getLastName();
    }


    //To Sort by First Name.




    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName+", Birthday: "+ getMonth()+"-"+getDate()+",Cell number: "+ getCellNumber();
    }
}
