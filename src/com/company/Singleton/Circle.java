package com.company.Singleton;

public class Circle extends Shape{

    private double radius;

    public Circle(double width, double height, String name, double radius) {
        super(width, height, name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
