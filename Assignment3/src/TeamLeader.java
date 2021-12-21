public class TeamLeader extends ProductionWorker{

    private int monthlyBonus;
    private double requiredTrainingHours;
    private double completedTrainingHours;

    public TeamLeader() {
        this.monthlyBonus=0;
        this.requiredTrainingHours=0;
        this.completedTrainingHours=0;
    }

    public TeamLeader(ProductionWorker obj,int monthlyBonus,double requiredTrainingHours,double completedTrainingHours)
    {
        super(obj);
        this.monthlyBonus=monthlyBonus;
        this.completedTrainingHours=completedTrainingHours;
        this.requiredTrainingHours=requiredTrainingHours;
    }

    public TeamLeader(Employee emp, int shift, double hourlyPay, int monthlyBonus, double requiredTrainingHours, double completedTrainingHours) {
        super(emp, shift, hourlyPay);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.completedTrainingHours = completedTrainingHours;
    }

    public TeamLeader(String name, String empNumber, String hireDate, int shift, double hourlyPay, int monthlyBonus, double requiredTrainingHours, double completedTrainingHours) {
        super(name, empNumber, hireDate, shift, hourlyPay);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.completedTrainingHours = completedTrainingHours;
    }

    public int getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(int monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public double getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(double requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public double getCompletedTrainingHours() {
        return completedTrainingHours;
    }

    public void setCompletedTrainingHours(double completedTrainingHours) {
        this.completedTrainingHours = completedTrainingHours;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Monthly Bonus: $"+ this.monthlyBonus+"\n"+
                "Required Training Hours: "+this.requiredTrainingHours+"Hrs\n"+
                "Completed Training Hours: "+this.completedTrainingHours+"Hrs";
    }
}
