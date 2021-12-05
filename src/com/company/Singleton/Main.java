package com.company.Singleton;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(1, 1, "Square", 1);
        Circle circle = new Circle(1, 1, "Circle", 0.5);
        square.addToShapesManager();
        circle.addToShapesManager();
        ShapesManager shapesManager = ShapesManager.getInstance();
        shapesManager.displayShapes();
    }
}
