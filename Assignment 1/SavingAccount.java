public class SavingAccount {
    private double balance;
    private double annualInterest;
    private double tInterest = 0;
    public SavingAccount(double balance,double annualInterest)
    {
        this.balance=balance;
        this.annualInterest=annualInterest;
    }
    public void withdraw(double amount)
    {
        if(this.balance-amount<0)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            this.balance-=amount;
        }
    }
    public void deposit(double amount)
    {
        this.balance+=amount;
    }
    public void monthly_interest()
    {
        double temp = (this.annualInterest/12)*this.balance;
        this.tInterest+=temp;
        this.balance+=temp;
    }

    public double getBalance() {
        return balance;
    }

    public double gettInterest() {
        return tInterest;
    }
}
