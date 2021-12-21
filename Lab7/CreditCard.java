public class CreditCard {

    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder,Money limit)
    {
        this.owner= newCardHolder;
        this.creditLimit= new Money(limit);
        this.balance = new Money(0);

    }
    public Money getBalance()
    {
        return new Money(balance);
    }
    public Money getCreditLimit()
    {
        return new Money(creditLimit);
    }
    public String getPersonals()
    {
        return owner.toString();
    }
    public void charge(Money amount) {
        Money tempM = new Money(balance.add(amount));
        if (tempM.compareTo(creditLimit) > 0) {
            System.out.println("Exceed credit limit");
        }
        else{
            balance = tempM;
            System.out.println("Charge: " + amount);
        }
    }

    public void payment(Money amount){
        balance = balance.subtract(amount);
    }
}
