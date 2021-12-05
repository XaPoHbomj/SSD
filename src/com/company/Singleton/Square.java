package com.company.Singleton;

public class Square extends Shape{

    private double side;

    public Square(double width, double height, String name, double side) {
        super(width, height, name);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
}
