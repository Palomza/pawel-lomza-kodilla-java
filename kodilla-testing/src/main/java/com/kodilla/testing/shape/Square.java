package com.kodilla.testing.shape;

public class Square implements Shape{

    private double side;
    private String shapeName = "Square";

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
