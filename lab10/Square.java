// File: Square.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Square. 

import static java.lang.Math.*;
import java.awt.*;
import javax.swing.*;

public final class Square extends Quadrilateral
{
    public Square ()
    {
    }

    public Square (int S, int X, int Y, Color C)
    {
        side = S;
        centerX = X;
        centerY = Y;
        color = C;
        angle = 0;

        setVertices();
    }

    public Square (Square C)
    {
        side = C.side;
        centerX = C.centerX;
        centerY = C.centerY;
        color = C.color;

        setVertices();
    }

    public void setSide (int S)
    {
        side = S;
    }

    public int getSide ()
    {
        return side;
    }

    public double area ()
    {
        return side * side;
    }

    public double perimeter ()
    {
        return 4 * side;
    }

    public String getName ()
    {
        return "Square";
    }

    public void setVertices() {
        vertexX[0] = centerX-side/2;
        vertexY[0] = centerY-side/2;
        vertexX[1] = centerX+side/2;
        vertexY[1] = centerY-side/2;
        vertexX[2] = centerX+side/2;
        vertexY[2] = centerY+side/2;
        vertexX[3] = centerX-side/2;
        vertexY[3] = centerY+side/2;

        angle %= 360;
        if (angle != 0) {
            rotate();
        }

        polygon = new Polygon(vertexX, vertexY, 4);
    }

    public void modifyShape (JFrame frame, int x, int y) {
        SquareDialog squaredialog = new SquareDialog (frame, true, x, y, side, angle); 
        if (squaredialog.getAnswer()) {
            side = squaredialog.getSide();
            color = squaredialog.getColor ();
            angle = squaredialog.getAngle();

            setVertices();
        }
    }

    public void fromString (String str)
    {
        String [] parts = str.split (" ");
        try
        {
            centerX = Integer.parseInt(parts[0]);
            centerY = Integer.parseInt(parts[1]);
            side = Integer.parseInt(parts[2]);
            color = new Color(Integer.parseInt(parts[3]));
            angle = (int)Double.parseDouble (parts[4]);
        }
        catch (NumberFormatException e)
        {
            System.out.println ("Numeric input error");
        }
    }

    public String toString ()
    {
        String string = new String ();
        string += centerX + " ";
        string += centerY + " ";
        string += side + " ";
        string += color.getRGB() + " ";
        string += angle + " ";
        return string;
    }
}
