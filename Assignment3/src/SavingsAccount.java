public class SavingsAccount extends BankAccount{
    private boolean status = false;

    public SavingsAccount(double balance, double annualInterest) {
        super(balance, annualInterest);
        if(balance>=25) {
            this.status = true;
        }

    }

    @Override
    public void withdraw(double input) {
        if(status) {
            super.withdraw(input);
            if(getBalance()<25)
            {
                this.status =false;
            }
        }
        else
            System.out.println("Not Active");
    }

    @Override
    public void deposit(double input) {
        super.deposit(input);
        if(this.getBalance()>25)
        {
            this.status = true;
        }
    }

    @Override
    public void monthlyProcess() {
        if(this.getNumofWithdraw()>4) {
            int temp = (this.getNumofWithdraw() - 4);
            this.setMonthlyCharge(temp);
        }
        super.monthlyProcess();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
