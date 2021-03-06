// File: Equilateral.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Equilateral. 

import static java.lang.Math.*;
import java.awt.*;
import javax.swing.*;

public final class Equilateral extends Triangle {
    public Equilateral () {
    }

    public Equilateral (Equilateral E) {
        side = E.side;
        centerX = E.centerX;
        centerY = E.centerY;
        color = E.color;
        for (int i = 0; i < 3; i++)
        {
            vertexX[i] = E.vertexX[i];
            vertexY[i] = E.vertexY[i];
        }
    }

    public Equilateral (int S, int X, int Y, Color C) {
        side = S;
        centerX = X;
        centerY = Y;
        color = C;
        setVertices ();
    }

    public void setVertices () {
        vertexX[0] = vertexY[0] = 0;
        vertexX[1] = side/2; vertexY[1] = (int) (-side * sqrt(3) / 2);
        vertexX[2] = side; vertexY[2] = 0;
        double perim = perimeter ();
        int inX = 0, inY = 0;
        if (perim > 0) {
            inX = (int) (side * (vertexX[0] + vertexX[1] + vertexX[2]) / perim);
            inY = (int) (side * (vertexY[0] + vertexY[1] + vertexY[2]) / perim);
        }
        for (int i = 0; i < 3; i++) {
            vertexX[i] += (centerX - inX);
            vertexY[i] += (centerY - inY);
        }

        angle %= 360;
        if (angle != 0) {
            rotate();
        }

        polygon = new Polygon (vertexX, vertexY, 3);
    }
    public void setSide (int S) {
        side = S;
    }

    public int getSide () {
        return side;
    }

    public void modifyShape (JFrame frame, int x, int y) {
        EquilateralDialog equilateraldialog = new EquilateralDialog (frame, true, x, y, side, (int)(angle)); 
        if (equilateraldialog.getAnswer()) {
            side = equilateraldialog.getSide();
            angle = equilateraldialog.getAngle();
            color = equilateraldialog.getColor ();

            setVertices();
        }
    }

    public void fromString (String str) {
        String [] parts = str.split (" ");
        try {
            centerX = Integer.parseInt(parts[0]);
            centerY = Integer.parseInt(parts[1]);
            side = Integer.parseInt(parts[2]);
            color = new Color(Integer.parseInt(parts[3]));
            angle = Double.parseDouble (parts[4]);
            setVertices ();
        }
        catch (NumberFormatException e) {
            System.out.println ("Numeric input error");
        }
    }

    public String toString () {
        String string = new String ();
        string += centerX + " ";
        string += centerY + " ";
        string += side + " ";
        string += color.getRGB() + " ";
        string += angle + " ";
        return string;
    }

    public double area () {
        return sqrt(3) * side * side / 4;
    }

    public double perimeter () {
        return 3 * side;
    }

    public String getName () {
        return "Equilateral";
    }

    public boolean isIn (int X, int Y) {
        int deltaX = X - centerX;
        int deltaY = Y - centerY;
        double dist = sqrt (deltaX * deltaX + deltaY * deltaY);
        //System.out.println ("dist = " + dist + " side = " + side);
        return dist <= side;
    }
}
