public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private double time;
    public ParkingTicket(ParkedCar car,int badgenum,String name)
    {
        this.car = car;
        this.officer = new PoliceOfficer(badgenum,name);

    }
    public void calcFine(double time)
    {
        this.time=time;
        if((time/60)>1)
        {
            this.fine=25+(Math.ceil((time/60)-1)*10);
        }

    }

    @Override
    public String toString() {
        return car +"\n"+
                officer+
                "\n Minutes Illegally Parked" + this.time +
                "\n Fine: $"+this.fine;
    }

    public double getFine() {
        return fine;
    }

    public double getTime() {
        return time;
    }
}
