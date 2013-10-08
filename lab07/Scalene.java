// File: Scalene.java
// Author: Amandeep Gill
// Contents: the declaration and implementation of the Scalene class

import static java.lang.Math.*;

public class Scalene extends Triangle {
    private double side2;
    private double side3;

    public Scalene() {
    }

    public Scalene(double s1, double s2, double s3) {
        side = s1;
        side2 = s2;
        side3 = s3;
    }

    @Override
    public String getName() {
        return "Scalene";
    }

    @Override
    public double area() {
        double p = perimeter()/2;
        return sqrt(p * (p - side) * (p - side2) * (p - side3));
    }

    @Override
    public double perimeter() {
        return side + side2 + side3;
    }

    public void setSide2(double s2) {
        side2 = s2;
    }

    public void setSide3(double s3) {
        side3 = s3;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
