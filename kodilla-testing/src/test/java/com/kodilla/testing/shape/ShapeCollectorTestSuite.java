package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Shape Collector Test Suite")
class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Square tests")
    class SquareTest {
        @Test
        void testGetShapeName() {
            Square square = new Square(2.0);
            Assertions.assertEquals("Square", square.getShapeName());
        }
        @Test
        void testGetArea() {
            Square square = new Square(8.0);
            Assertions.assertEquals(64.0, square.getArea());
        }
    }

    @Nested
    @DisplayName("Triangle tests")
    class TriangleTest{
        @Test
        void testGetShapeName() {
            Triangle triangle = new Triangle(5.0, 3.0);
            Assertions.assertEquals("Triangle", triangle.getShapeName());
        }
        @Test
        void testGetArea() {
            Triangle triangle = new Triangle(10.0, 5.0);
            Assertions.assertEquals(25, triangle.getArea());
        }
    }

    @Nested
    @DisplayName("Circle tests")
    class CircleTest{
        @Test
        void testGetShapeName() {
            Circle circle = new Circle(10.0);
            Assertions.assertEquals("Circle", circle.getShapeName());
        }
        @Test
        void testGetArea() {
            Circle circle = new Circle(10.0);
            Assertions.assertEquals(314, circle.getArea());
        }
    }

    @Nested
    @DisplayName("Shape Collector tests")
    class ShapeCollectorTest{
        @Test
        void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(10.0);
            //When
            shapeCollector.addShape(square);
            //Then
            Assertions.assertEquals(square, shapeCollector.getShape(0));
        }
        @Test
        void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(7.0);
            Triangle triangle = new Triangle(10.0, 5.0);
            //When
            shapeCollector.addShape(square);
            shapeCollector.addShape(triangle);
            shapeCollector.removeShape(0);
            //Then
            Assertions.assertEquals(triangle, shapeCollector.getShape(0));
        }
        @Test
        void testGetShape(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(15.0);
            //When
            shapeCollector.addShape(square);
            //Then
            Assertions.assertEquals(square, shapeCollector.getShape(0));
        }

        @Test
        void testGetAllShapes(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5.0);
            Triangle triangle = new Triangle(5.0, 2.0);
            Circle circle = new Circle(5.0);
            Square square1 = new Square(9);
            //When
            shapeCollector.addShape(square);
            shapeCollector.addShape(square1);
            shapeCollector.addShape(circle);
            shapeCollector.addShape(triangle);
            //Then
            Assertions.assertEquals("Square, Square, Circle, Triangle", shapeCollector.getShapes());
        }
    }
}