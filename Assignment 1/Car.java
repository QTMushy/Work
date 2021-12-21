public class Car {
    private int model;
    private String make;
    private int speed;

    public Car(int model, String make) {
        this.model = model;
        this.make = make;
        this.speed=0;
        System.out.println("Current State of Car...");
        System.out.println("Make: "+this.make);
        System.out.println("Model: "+this.model);
        System.out.println("Speed: "+this.speed);
    }

    public int getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }
    public void accelerate()
    {
        this.speed+=5;
    }
    public void Brake()
    {
        this.speed-=5;
    }
}
