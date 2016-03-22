package com.company;

/**
 * Created by Inna on 17.03.2016.
 */
public class Triangle implements Shape1 {
    String color = "Red";
    double area = 36;
    int angle = 3;

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
