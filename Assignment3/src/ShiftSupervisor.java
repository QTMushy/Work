public class ShiftSupervisor extends Employee{
    private double annualSalary;
    private double annualBonus;

    public ShiftSupervisor(String name, String empNumber, String hireDate, double annualSalary, double annualBonus) {
        super(name, empNumber, hireDate);
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    public ShiftSupervisor(Employee emp, double annualSalary, double annualBonus) {
        super(emp);
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    public ShiftSupervisor() {
        this.annualBonus=0;
        this.annualSalary=0;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Annual Salary: $"+this.annualSalary+"\n"+
                "Annual Bonus: $"+this.annualBonus+"\n";
    }
}
