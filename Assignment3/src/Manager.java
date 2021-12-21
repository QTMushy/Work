import java.util.ArrayList;

public class Manager extends Employeea2{

    private int monthlyBonus;
    ArrayList<Employeea2> listEmployee = new ArrayList<>();

    public Manager(String firstName, String lastName, String yearHiring, int annualSalary, int monthlyBonus) {
        super(firstName, lastName, yearHiring, annualSalary);
        this.monthlyBonus = monthlyBonus;
    }

    public Manager(String first, String last) {
        super(first, last);
    }

    public Manager(String firstName, String lastName, String cellNumber, String month, int date, String yearofHiring, int annualSalary, int monthlyBonus) {
        super(firstName, lastName, cellNumber, month, date, yearofHiring, annualSalary);
        this.monthlyBonus = monthlyBonus;
    }
    public void addEmployee(Employeea2 input)
    {
        this.listEmployee.add(input);
    }

    public int getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(int monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public void removeEmployee(Employeea2 input)
    {
        for(int i = 0; i< listEmployee.size(); i++)
        {
            if(this.listEmployee.get(i).equals(input))
            {
                this.listEmployee.remove(i);
            }
        }

    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + ", Brithday: " + getMonth() + "-" + getDate() + ", Cell number: " +
                getCellNumber() + ", Hire year: " + getYearHiring() + ", Salary: " + getAnnualSalary() + ", Vacation days: " + getVacationDays() +
                ", Monthly bonus: " + getMonthlyBonus();
    }
}