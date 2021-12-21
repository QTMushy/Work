package com.company;

public class Dog extends animal{
    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;
    public Dog( int size, String name, int weight,int eyes,int tails,int teeth,int legs,String coat) {
        super(1, 1, size, name, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.coat=coat;
        this.tails=tails;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void run(){
        System.out.println("Dog is moving at 10 speed");
        move(10);
        move(10);
    }

    private void chew(){
        System.out.println("Dog.chew called");
    }

   /* @Override
    public void move(int speed) {
        System.out.println("dog.move executed");

        super.move(speed);
    }*/
}
