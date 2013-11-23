// File: Quadrilateral.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Quadrilateral. 

import java.awt.*;
import static java.lang.Math.*;

public class Quadrilateral extends Shape
{
    protected int [] vertexX = new int [4];
    protected int [] vertexY = new int [4];
    protected Polygon polygon = new Polygon (vertexX, vertexY, 4);
    protected int angle = 0;

    Quadrilateral ()
    {
    }

    public void setCenterX (int X)
    {
        centerX = X;
        setVertices ();
    }

    public void setCenterY (int Y)
    {
        centerY = Y;
        setVertices ();
    }

    public void setAngle(int theta) 
    {
        angle = -(int)(theta/(2 * Math.PI));
    }

    public void paintComponent (Graphics2D g2)
    {
        g2.setPaint (color);
        g2.fillPolygon (vertexX, vertexY, 4);
        g2.drawPolygon (vertexX, vertexY, 4);
        g2.setPaint (Color.BLACK);
        g2.fillOval (centerX-1, centerY-1, 2, 2); // Draw the center point
    }

    public void rotate()
    {
        for (int i = 0; i < 4; ++i) 
        {
            int x = centerX - vertexX[i];
            int y = centerY - vertexY[i];

            vertexX[i] = centerX + (int)(x * Math.cos(-Math.toRadians(angle)) - y * Math.sin(-Math.toRadians(angle)));
            vertexY[i] = centerY + (int)(y * Math.cos(-Math.toRadians(angle)) + x * Math.sin(-Math.toRadians(angle)));
        }
    }

    protected void setVertices ()
    {
    }

    public boolean isIn (int X, int Y)
    {
        return polygon.contains (X, Y);
    }

    public void move (int deltaX, int deltaY)
    {
        centerX += deltaX;
        centerY += deltaY;
        setVertices ();
    }

    public String getName ()
    {
        return "Quadrilateral";
    }
}
