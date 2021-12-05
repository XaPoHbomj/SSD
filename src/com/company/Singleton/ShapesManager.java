package com.company.Singleton;

import java.util.ArrayList;

public class ShapesManager {

    private final ArrayList<Shape> list;
    static public final ShapesManager instance = new ShapesManager();

    protected ShapesManager() {
        list = new ArrayList<>();
    }

    static public ShapesManager getInstance() {
        return instance;
    }

    public void addShape(Shape shape) {
        list.add(shape);
    }

    public void displayShapes() {
        System.out.println("Total shapes: " + list.size());
    }
}
