// File: Rectangle.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Rectangle. 

import static java.lang.Math.*;
import java.awt.*;
import javax.swing.*;

public final class Rectangle extends Quadrilateral
{
    private int side2;

    public Rectangle ()
    {
        side2 = 0;
    }

    public Rectangle (Rectangle R)
    {
        side = R.side;
        side2 = R.side2;
        centerX = R.centerX;
        centerY = R.centerY;
        color = R.color;

        setVertices();
    }

    public Rectangle (int S1, int S2, int X, int Y, Color C)
    {
        side = S1;
        side2 = S2;
        centerX = X;
        centerY = Y;
        color = C;
        angle = 0;

        setVertices();
    }

    public void setSide1 (int S1)
    {
        side = S1;
    }

    public int getSide1 ()
    {
        return side;
    }

    public void setSide2 (int S2)
    {
        side2 = S2;
    }

    public int getSide2 ()
    {
        return side2;
    }

    public double perimeter ()
    {
        return 2 * (side + side2);
    }

    public double area ()
    {
        return side * side2;
    }

    public String getName ()
    {
        return "Rectangle";
    }

    public void modifyShape (JFrame frame, int x, int y) {
        RectangleDialog rectangledialog = new RectangleDialog (frame, true, x, y, side, side2, angle); 
        if (rectangledialog.getAnswer()) {
            side = rectangledialog.getSide();
            side2 = rectangledialog.getSide2();
            angle = rectangledialog.getAngle();
            color = rectangledialog.getColor ();

            setVertices();
        }
    }

    public void setVertices() {
        vertexX[0] = centerX-side/2;
        vertexY[0] = centerY-side2/2;
        vertexX[1] = centerX+side/2;
        vertexY[1] = centerY-side2/2;
        vertexX[2] = centerX+side/2;
        vertexY[2] = centerY+side2/2;
        vertexX[3] = centerX-side/2;
        vertexY[3] = centerY+side2/2;

        angle %= 360;
        if (angle != 0)
            rotate();

        polygon = new Polygon(vertexX, vertexY, 4);
    }

    public void fromString (String str)
    {
        String [] parts = str.split (" ");
        try
        {
            centerX = Integer.parseInt(parts[0]);
            centerY = Integer.parseInt(parts[1]);
            side = Integer.parseInt(parts[2]);
            side2 = Integer.parseInt(parts[3]);
            color = new Color(Integer.parseInt(parts[4]));
            angle = (int)Double.parseDouble (parts[5]);
        }
        catch (NumberFormatException e)
        {
            System.out.println ("File input error - invalid integer");;
        }
    }

    public String toString ()
    {
        String string = new String ();
        string += centerX + " ";
        string += centerY + " ";
        string += side + " ";
        string += side2 + " ";
        string += color.getRGB() + " ";
        string += angle + " ";
        return string;
    }
}
