// File: Circle.java
// Author: Amandeep Gill
// Contents: The decleration and implementation of the Circle class

public class Circle extends Shape {
    private static double pi = 3.14159;

    Circle() {
        side = 0.0;
    }

    Circle(double s) {
        side = s;
    }

    @Override
    public String sides() {
        return "infinite";
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double area() {
        return side * side * pi;
    }

    @Override
    public double perimeter() {
        return side * pi * 2;
    }
}
