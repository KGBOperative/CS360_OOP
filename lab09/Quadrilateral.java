// File: Quadrilateral.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Quadrilateral. 

import java.awt.*;

public class Quadrilateral extends Shape
{
    protected int [] vertexX = new int [4];
    protected int [] vertexY = new int [4];
    protected Polygon polygon = new Polygon (vertexX, vertexY, 4);
    protected double angle = 0.0;

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

    public void paintComponent (Graphics2D g2)
    {
        g2.setPaint (color);
        g2.fillPolygon (vertexX, vertexY, 4);
        g2.drawPolygon (vertexX, vertexY, 4);
        g2.setPaint (Color.BLACK);
        g2.fillOval (centerX-1, centerY-1, 2, 2); // Draw the center point
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
