package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double radius;
    private String shapeName = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
