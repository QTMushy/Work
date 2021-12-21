public class ParkingTicketSimulator {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Volkswagon","1972","Red","147RHZM",125);
        PoliceOfficer officer = new PoliceOfficer(4788,"Joe Friday");

        ParkingMeter meter = new ParkingMeter();
        meter.settime(60);
        ParkingTicket ticket = officer.inspection(car,meter);
        System.out.println(ticket);

    }
}
