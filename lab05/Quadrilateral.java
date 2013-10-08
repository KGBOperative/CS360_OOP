// File: Quadrilateral.java
// Author: Amandeep Gill
// Contents: declaration and implementation of the virtual class Quadrilateral

public class Quadrilateral extends Shape {
    protected double side2;

    public Quadrilateral() {
    }

    @Override
    public String sides() {
        return "4";
    }

    @Override
    public String getName() {
        return "Quadrilateral";
    }

    public void setSide2(double s2) {
        side2 = s2;
    }

    public double getSide2() {
        return side2;
    }
}
