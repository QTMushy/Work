public class ParkedCar{
    private String make;
    private String model;
    private String color;
    private String license;
    public double numberofMinuites;
     ParkingMeter time = new ParkingMeter();
    public void timeofTicket(double time)
    {
        this.time.settime(time);
    }

}