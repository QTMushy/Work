

public class Employeea2 extends Persona2{

    private String yearHiring;
    private int annualSalary;
    private int vacationDays = 0;
    private int unusedVacationDays = 15;

    public Employeea2(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employeea2(String firstName, String lastName, String yearHiring, int annualSalary) {
        super(firstName, lastName);
        this.yearHiring = yearHiring;
        this.annualSalary = annualSalary;
    }

    public Employeea2(String firstName, String lastName, String cellNumber, String month, int date, String yearofHiring, int annualSalary) {
        super(firstName, lastName, cellNumber, month, date);
        this.yearHiring = yearofHiring;
        this.annualSalary = annualSalary;
    }

    public String getYearHiring() {
        return yearHiring;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public int getUnusedVacationDays() {
        return unusedVacationDays;
    }

    public void takeLeave(int days)
    {
        if (this.unusedVacationDays-days<0)
        {
            System.out.println("Sorry you don't have enough vacation days");
        }
        else
        {
            this.unusedVacationDays -= days;
            this.vacationDays += days;
        }
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + ", Brithday: " + getMonth() + "-" + getDate() + ", Cell number: " +
                getCellNumber() + ", Hire year: " + getYearHiring() + ", Salary: " + getAnnualSalary() + ", Vacation days: " + getVacationDays();
    }

}