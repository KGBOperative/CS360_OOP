// File: Scalene.java
// Author: Amandeep Gill
// Contents: the declaration and implementation of the Scalene class

import static java.lang.Math.*;
import java.awt.*;

public class Scalene extends Triangle {
    private int side2;
    private int side3;
    private int centerX;
    private int centerY;

    public Scalene() {
    }

    public Scalene(int s1, int s2, int s3, int x, int y) {
        side = s1;
        side2 = s2;
        side3 = s3;

        centerX = x;
        centerY = y;
    }

    @Override
    public String getName() {
        return "Scalene";
    }

    @Override
    public double area() {
        double s = perimeter()/2;
        return sqrt(s * (s - side) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side + side2 + side3;
    }

    public void setSide2(int s2) {
        side2 = s2;
    }

    public void setSide3(int s3) {
        side3 = s3;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    @Override
    public void paintComponent(Graphics2D g2)  {
        int x1[] = new int[3];
        int y1[] = new int[3];

        double radius = 2 * area() / perimeter();
        double s = perimeter() / 2;
        double height = 2 * area() / side;
        double length = sqrt(side2 * side2 - height * height);

        length = (side2 < side3) ? -length : length;

        int xo = centerX - (int)((side * length + side * side2) / perimeter());
        int yo = centerY + (int)radius;

        /*
        double s = (side + side2 + side3) / 2;
        double a = sqrt(s * (s - side) * (s - side2) * (s - side3));
        double h = 2 * a / side;
        double l = sqrt(side3 * side3 - h * h);

        double x = (side* (side - l) + side2 * side) / (s * 2);
        double y = (side * h) / (s * 2);

        double xo = centerX - x;
        double yo = centerY + y;
        */

        x1[0] = (int)(xo);
        y1[0] = (int)(yo);
        x1[1] = (int)(xo + side);
        y1[1] = (int)(yo);
        x1[2] = (int)(xo + length);
        y1[2] = (int)(yo - height);

        int x2[] = {centerX, centerX+1, centerX-1};
        int y2[] = {centerY-1, centerY+1, centerY+1};

        g2.drawPolygon(x1, y1, 3);
        g2.drawPolygon(x2, y2, 3);
    }
}
