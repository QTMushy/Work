public class CarDemo {
    public static void main(String[] args){
        Car car = new Car(2004,"Porsche");

        System.out.println("Accelerating...");
        for(int i=0;i<5;i++)
        {
            car.accelerate();
        }
        System.out.println("Now the Speed is: "+car.getSpeed());
        System.out.println("Braking...");
        for(int i=0;i<5;i++)
        {
            car.Brake();
        }
        System.out.println("Now the Speed is: "+car.getSpeed());
    }
}
