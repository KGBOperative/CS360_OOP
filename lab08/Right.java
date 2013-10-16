// File: Right.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Right. 

import static java.lang.Math.*;
import java.awt.*;

public final class Right extends Triangle
{
	private int side2;
    private double side3;
    private int centerX;
    private int centerY;

	public Right ()
	{
		side2 = 0;
        side3 = 0;
        centerX = 0;
        centerY = 0;
	}
	
	public Right (Right R)
	{
		side = R.side;
		side2 = R.side2;
        side3 = R.side3;
        centerX = R.centerX;
        centerY = R.centerY;
	}
	
	public Right (int S1, int S2, int x, int y)
	{
		side = S1;
		side2 = S2;
        side3 = sqrt(side * side + side2 * side2);
        centerX = x;
        centerY = y;
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
	
    @Override
	public double perimeter ()
	{
		return side + side2 + side3;
	}
	
    @Override
	public double area ()
	{
		return side * side2 / 2;
	}
	
    @Override
	public String getName ()
	{
		return "Right";
	}

    @Override
    public void paintComponent(Graphics2D g2)  {
        int x1[] = new int[3];
        int y1[] = new int[3];

        double s = (side + side2 + side3) / 2;
        double a = area(); //sqrt(s * (s - side) * (s - side2) * (s - side3));
        double h = side2; //2 * a / side;
        double l = side; //sqrt(side3 * side3 - h * h);

        double x = (side* (side - l) + side2 * side) / (s * 2);
        double y = (side * h) / (s * 2);

        double xo = centerX - x;
        double yo = centerY + y;

        x1[0] = (int)(xo);
        y1[0] = (int)(yo);
        x1[1] = (int)(xo + side);
        y1[1] = (int)(yo);
        x1[2] = (int)(xo + side - l);
        y1[2] = (int)(yo - h);

        int x2[] = {centerX, centerX+1, centerX-1};
        int y2[] = {centerY-1, centerY+1, centerY+1};

        g2.drawPolygon(x1, y1, 3);
        g2.drawPolygon(x2, y2, 3);
    }
}	
