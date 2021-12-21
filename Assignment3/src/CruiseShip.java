public class CruiseShip extends Ship {

    private int Capacity;

    public CruiseShip(String name, String year, int capacity) {
        super(name, year);
        Capacity = capacity;
    }

    @Override
    public String toString() {
        return "Name: "+ this.getName()+"\n"+
                "Max Passenger: "+this.Capacity;
    }
}
