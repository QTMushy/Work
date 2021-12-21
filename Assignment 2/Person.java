

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private String cellNumber;
    private String month;
    private int Date;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String cellNumber, String month, int date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellNumber = cellNumber;
        this.month = month;
        Date = date;
    }


    public Person(Person input)

    {
        this.firstName= input.firstName;
        this.lastName=input.lastName;
        this.month= input.month;
        this.cellNumber=input.cellNumber;
        this.Date= input.Date;
    }
    public Person() {
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
    public int compareTo(Person o) {
        return this.firstName.compareToIgnoreCase(o.getFirstName());
    }

    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName+", Birthday: "+ getMonth()+"-"+getDate()+",Cell number: "+ getCellNumber();
    }
}
class LastNameComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }
}

class DayofBirthComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDate()-o2.getDate();
    }
}