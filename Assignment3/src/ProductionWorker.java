public class ProductionWorker extends Employee{

    private int shift;
    private double hourlyPay;
    private String timing;

    public ProductionWorker(String name, String empNumber, String hireDate, int shift, double hourlyPay) {
        super(name, empNumber, hireDate);
        this.shift = shift;
        this.hourlyPay = hourlyPay;
        setTiming();
    }

    public ProductionWorker(ProductionWorker obj)
    {
        this(obj.name,obj.empNumber,obj.hireDate, obj.shift,obj.hourlyPay);
    }

    public ProductionWorker(Employee emp, int shift, double hourlyPay) {
        super(emp);
        this.shift = shift;
        this.hourlyPay = hourlyPay;
        setTiming();
    }

    public ProductionWorker(int shift, double hourlyPay) {
        this.shift = shift;
        this.hourlyPay = hourlyPay;
        setTiming();
    }

    public ProductionWorker() {
        this.hourlyPay=0;
        this.shift=-1;
        this.timing="";
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setTiming()
    {
        if(this.shift==1)
        {
           this.timing="Day";
        }
        else if (this.shift==2)
        {
            this.timing="Timing";
        }
        else
        {
            System.out.println("Invalid Input");
            this.timing="";
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "Shift: "+ this.timing+"\n"+
                "Hourly Pay Rate: "+this.hourlyPay;
    }

    @Override
    public boolean equals(Object obj) {
        ProductionWorker temp = (ProductionWorker) obj;
        if (this.shift == ((ProductionWorker) obj).shift && this.hourlyPay == ((ProductionWorker) obj).hourlyPay) {
            return super.equals(obj);
        }
        else
        {
            return false;
        }
    }
}
