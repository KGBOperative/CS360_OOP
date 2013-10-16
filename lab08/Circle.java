// File: Circle.java
// Author: Amandeep Gill
// Contents: The decleration and implementation of the Circle class

import java.awt.*;

public class Circle extends Shape {
    private static double pi = 3.14159;

    Circle() {
        side = 0;
    }

    Circle(int s, int x, int y) {
        side = s;
        centerX = x;
        centerY = y;
    }

    Circle(int s) {
        side = s;
    }

    public void paintComponent(Graphics2D g2) {
        g2.drawOval(centerX-1, centerY-1, 2, 2);
        g2.drawOval(centerX-side, centerY-side, 2*side, 2*side);
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
