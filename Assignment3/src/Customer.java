public class Customer extends Person {
    private Boolean mailList;
    private String customerNumber;

    public Customer(String name, String address, String phoneNum, Boolean mailList,String customerNumber) {
        super(name, address, phoneNum);
        this.mailList = mailList;
        this.customerNumber = customerNumber;
    }

    public Customer() {
        this.mailList=false;
        this.customerNumber = "NA";
    }
    private String mail()
    {
        if(this.mailList)
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "Customer Number: "+this.customerNumber+"\n"+
                "Mailing List: " + this.mail()+"\n";
    }
}
