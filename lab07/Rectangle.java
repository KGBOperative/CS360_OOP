// File: Rectangle.java
// Author: Amandeep Gill
// Contents: the declaration and implementation of the Rectangle class

import java.awt.*;

public class Rectangle extends Quadrilateral {
    public Rectangle() {
    }

    public Rectangle(int s1, int s2, int x, int y) {
        side = s1;
        side2 = s2;
        centerX = x;
        centerY = y;
    }

    @Override
    public void paintComponent(Graphics2D g2) {
        g2.drawRect(centerX-1, centerY-1, 2, 2);
        g2.drawRect(centerX-side/2, centerY-side2/2, side, side2);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double area() {
        return side * side2;
    }

    @Override
    public double perimeter() {
        return 2 * side * side2;
    }
}
