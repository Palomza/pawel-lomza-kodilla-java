package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private ArrayList<Shape> shapes;

    public ShapeCollector() {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void removeShape(int n){
        shapes.remove(n);
    }

    public Shape getShape(int n){
        return shapes.get(n);
    }

    public String getShapes(){
        String shapesString = "";
        for(Shape x : shapes) {
            shapesString = shapesString + x.getShapeName() + ", ";
        }
        return shapesString.substring(0, shapesString.length() - 2);
    }
}
