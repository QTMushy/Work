public class PreferredCustomer extends Customer{
    private double spent;
    private double discount;

    public PreferredCustomer(String name, String address, String phoneNum, Boolean mailList, String customerNumber, double spent) {
        super(name, address, phoneNum, mailList, customerNumber);
        this.spent = spent;
        this.setDiscount();
    }

    private void setDiscount()
    {
        if(this.spent>=500)
        {
            this.discount = 0.05;
        }
        if (this.spent>=1000)
        {
            this.discount = 0.06;
        }
       if (this.spent>=1500)
        {
            this.discount = .07;
        }
        if (this.spent>=2000)
        {
            this.discount = .10;
        }

    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Purchases: $"+this.spent+"\n"+
                "Discount Level: "+this.discount+"\n";
    }
}
