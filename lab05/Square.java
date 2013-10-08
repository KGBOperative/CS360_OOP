// File: Square.java
// Author: Amandeep Gill
// Contents: The decleration and implementation of the Square class

public class Square extends Quadrilateral {

    public Square() {
    }

    public Square(double s) {
        side = s;
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
