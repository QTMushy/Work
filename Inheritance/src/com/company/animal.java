package com.company;

public class animal {
    private int brain;
    private int body;
    private int size;
    private String name;
    private int weight;

    public animal(int brain, int body, int size, String name, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.name = name;
        this.weight = weight;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    public void eat(){
        System.out.println("Animal.eat executed");

    }
    public void move(int speed)
    {
        System.out.println("Animal.move executed");
        System.out.println("Animal is moving at"+speed);

    }
}
