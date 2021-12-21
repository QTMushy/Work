package com.company;

public class ComplexNumbers {
    private double real;
    private double imaginary;

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void add(double real,double imaginary)
    {
        this.real+=real;
        this.imaginary+=imaginary;

    }
    public void add(ComplexNumbers obj)
    {
        this.real+=obj.getReal();
        this.imaginary+=obj.getImaginary();
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
