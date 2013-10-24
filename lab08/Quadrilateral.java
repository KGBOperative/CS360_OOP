// File: Quadrilateral.java
// Author: Amandeep Gill
// Contents: declaration and implementation of the virtual class Quadrilateral

public class Quadrilateral extends Shape {
    protected int side2;

    public Quadrilateral() {
    }

    public String sides() {
        return "4";
    }

    @Override
    public String getName() {
        return "Quadrilateral";
    }

    public void setSide2(int s2) {
        side2 = s2;
    }

    public int getSide2() {
        return side2;
    }
}
