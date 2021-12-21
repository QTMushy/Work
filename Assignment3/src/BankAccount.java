public abstract class BankAccount {
    private double balance;
   private int numofDepinMonth;
   private int numofWithdraw;
   private double annualInterest;
   private double monthlyCharge;

    public BankAccount(double balance,double annualInterest) {
        this.annualInterest = annualInterest;
        this.balance = balance;
        this.monthlyCharge=0;
        this.numofDepinMonth=0;
        this.numofWithdraw = 0;
    }
    public void deposit(double input)
    {
        this.balance += input;
        this.numofDepinMonth++;
    }
    public void withdraw(double input)
    {
        this.balance -= input;
        this.numofWithdraw++;
    }
    public void calcInterest()
    {
        this.balance = ((this.annualInterest/12)*this.balance)+this.balance;
    }
    public void monthlyProcess()
    {
        this.balance -= this.monthlyCharge;
        calcInterest();
    }

    public void setMonthlyCharge(double monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumofDepinMonth() {
        return numofDepinMonth;
    }

    public int getNumofWithdraw() {
        return numofWithdraw;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public double getMonthlyCharge() {
        return monthlyCharge;
    }

    @Override
    public String toString() {
        return "Balance: "+this.balance+"\n"+
                "Number of Deposit: "+this.numofDepinMonth+"\n"+
                "Number of Withdraw: "+ this.numofWithdraw;

    }
}
