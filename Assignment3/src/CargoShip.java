public class CargoShip extends Ship {
    private int capacity;

    public CargoShip(String name, String year, int capacity) {
        super(name, year);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Name: "+this.getName()+"\n"+
                "Cargo Capacity: "+this.capacity + " tons";
    }
}
