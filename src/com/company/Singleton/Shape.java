package com.company.Singleton;

public abstract class Shape {

    protected double width, height;
    protected String name;

    public Shape(double width, double height, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    public void addToShapesManager() {
        ShapesManager shapesManager = ShapesManager.getInstance();
        shapesManager.addShape(this);
    }

    abstract public double area();
}
