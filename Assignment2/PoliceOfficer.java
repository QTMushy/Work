public class PoliceOfficer {
    private int badgenum;
    private String name;
    ParkingTicket ticket;
    public void inspection(ParkedCar car)
    {
        
        if(car.numberofMinuites>car.time.minutesPurchased)
        {
            ticket = new ParkingTicket(car.numberofMinuites-car.time.minutesPurchased);
            

            
         

        }
        
    }


    
}
