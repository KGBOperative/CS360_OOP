// File: Square.java
// Author: Amandeep Gill
// Contents: The decleration and implementation of the Square class

import java.awt.*;

public class Square extends Quadrilateral {

    public Square() {
    }

    public Square(int s, int x, int y) {
        side = s;
        centerX = x;
        centerY = y;
    }

    public Square(int s) {
        side = s;
    }

    @Override
    public void paintComponent(Graphics2D g2) {
        g2.drawRect(centerX-side/2, centerY-side/2, side, side);
        g2.drawRect(centerX-1, centerY-1, 2, 2);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }
}
