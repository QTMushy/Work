public class Ship {
    private String name;
    private String year;


    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\n"
                +"Year Built: "+this.year+"\n";}
}
