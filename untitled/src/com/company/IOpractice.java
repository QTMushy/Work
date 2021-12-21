package com.company;

public class IOpractice {
    public static void main(String[] args) {
        double discountRate = 0.0;
        int purchase = 1250;
        if (purchase > 1000)
            discountRate = .05;
        if (purchase > 750)
            discountRate = .03;
        if (purchase > 500)
         discountRate = .01;
        else
            discountRate = 0;

        System.out.println(discountRate);

    }
}
