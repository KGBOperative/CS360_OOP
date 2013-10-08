// File: Rectangle.java
// Author: Amandeep Gill
// Contents: the declaration and implementation of the Rectangle class

public class Rectangle extends Quadrilateral {
    public Rectangle() {
    }

    public Rectangle(double s1, double s2) {
        side = s1;
        side2 = s2;
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

    public void setside2(double s2) {
        side2 = s2;
    }

    public double getSide2() {
        return side2;
    }
}
