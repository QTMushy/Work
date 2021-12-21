public class PoliceOfficer {
    private int badgenum;
    private String name;
    private boolean ticket=false;

    public PoliceOfficer(int badgenum, String name) {
        this.badgenum = badgenum;
        this.name = name;
    }

    public ParkingTicket inspection(ParkedCar car,ParkingMeter meter)
    {
        if(car.getMinutesParked()> meter.getMinutesPurchased())
        {
            ParkingTicket nt = new ParkingTicket(car,this.badgenum,this.name);
            nt.calcFine(car.getMinutesParked()- meter.getMinutesPurchased());
            return nt;
        }
        else
        {
            ParkingTicket nt = new ParkingTicket(car,this.badgenum,this.name);
            nt.calcFine(0);

            return nt;

        }

    }
    public int getBadgenum() {
        return badgenum;
    }

    public void setBadgenum(int badgenum) {
        this.badgenum = badgenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OfficerData:\n" +
                "Name: " + this.name +
                "\nBadgeNumber: " + this.badgenum;

    }
}
