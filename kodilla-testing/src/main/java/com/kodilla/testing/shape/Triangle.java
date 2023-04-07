package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double height;
    private String shapeName = "Triangle";

    public Triangle(double base, double heigth) {
        this.base = base;
        this.height = heigth;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
