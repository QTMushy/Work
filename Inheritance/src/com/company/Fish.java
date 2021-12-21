package com.company;

public class Fish extends animal{
    private int gills;
    private int fins;
    private int eyes;

    public Fish(int brain, int body, int size, String name, int weight, int gills, int fins, int eyes) {
        super(brain, body, size, name, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    public void rest()
    {

    }
    public void moveMuscle(){

    }
    public void moveBackFin(){

    }
    private void swim(int speed){
        moveBackFin();
        moveMuscle();
        super.move(speed);
    }
}
