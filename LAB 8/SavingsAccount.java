public class SavingsAccount extends BankAccount {
    private double rate = .025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name,double amount)
    {
        super(name, amount);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount oldAccount, double amount)
    {
        super(oldAccount, amount);
        this.savingsNumber = oldAccount.getSavingsNumber()+1;
        this.accountNumber = super.getAccountNumber() +"-"+ this.savingsNumber;
    }

    public int getSavingsNumber()
    {
        return this.savingsNumber;
    }

    public void postInterest()
    {
        super.setBalance(super.getBalance()+((super.getBalance()*this.rate)/12));
    }

    public String getAccountNumber()
    {
        return this.accountNumber;
    }
}
