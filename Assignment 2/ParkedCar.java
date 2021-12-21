public class ParkedCar{
    private String make;
    private String model;
    private String color;
    private String license;
   private double minutesParked;

    public ParkedCar(String make, String model, String color, String license, double minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.license = license;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public double getMinutesParked() {
        return minutesParked;
    }

    @Override
    public String toString() {
        return "Car Data:\n" +
                "Make:" + make +
                "\n model:" + model +
                "\n color:" + color +
                "\n License Number:" + license +
                "\n Minutes Parked:" + minutesParked;
    }
}