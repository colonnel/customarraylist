package com.company;

/**
 * Created by Inna on 17.03.2016.
 */
public class Circle implements Shape1 {
    String color = "Red";
    double area = 8;
    int angle = 0;

    @Override
    public void color() {
        System.out.println("I am " + color + " color");
    }

    @Override
    public void area() {
        System.out.println("My area is " + area);
    }

    @Override
    public void angle() {
        System.out.println("I have " + angle);
    }
}
