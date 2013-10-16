// File: Equilateral.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Equilateral. 

import static java.lang.Math.*;
import java.awt.*;

public final class Equilateral extends Triangle
{
	public Equilateral ()
	{
	}
	
    public Equilateral(int S) {
        side = S;
    }

	public Equilateral (Equilateral E)
	{
		side = E.side;
	}

	public Equilateral (int S, int x, int y)
	{
		side = S;
        centerX = x;
        centerY = y;
	}

    @Override
	public void fromString (String str)
	{
		String [] parts = str.split (" ");
		try
		{
			centerX = Integer.parseInt(parts[0]);
			centerY = Integer.parseInt(parts[1]);
			side = Integer.parseInt(parts[2]);
			color = new Color(Integer.parseInt(parts[3]));
			setVertices ();
		}
		catch (NumberFormatException e)
		{
			System.out.println ("File input error - invalid integer");;
		}
	}

    @Override
	public String toString ()
	{
		String string = new String ();
		string += centerX + " ";
		string += centerY + " ";
		string += side + " ";
		string += color.getRGB() + " ";
		return string;
	}

    @Override
    public void paintComponent(Graphics2D g2)  {
        int x1[] = new int[3];
        int y1[] = new int[3];

        double s = (side * 3) / 2;
        double a = sqrt(s * pow(s-side, 3));
        double h = 2 * a / side;
        double l = sqrt(side * side - h * h);

        double x = (side * side + side * l) / (s * 2);
        double y = (side * h) / (s * 2);

        double xo = centerX - x;
        double yo = centerY + y;

        x1[0] = (int)(xo);
        y1[0] = (int)(yo);
        x1[1] = (int)(xo + side);
        y1[1] = (int)(yo);
        x1[2] = (int)(xo + l);
        y1[2] = (int)(yo - h);

        int x2[] = {centerX, centerX+1, centerX-1};
        int y2[] = {centerY-1, centerY+1, centerY+1};

        g2.drawPolygon(x1, y1, 3);
        g2.drawPolygon(x2, y2, 3);
    }
	
	public void setSide (int S)
	{
		side = S;
	}
	
	public int getSide ()
	{
		return side;
	}
	
	public double perimeter ()
	{
		return 3 * side;
	}
	
	public double area ()
	{
		return sqrt(3) * side * side / 4;
	}
	
	public String getName ()
	{
		return "Equilateral";
	}

    /*
	public static void main (String [] args)
	{
		Equilateral T = new Equilateral ();
		T.write ();
		System.out.println ();
		T = new Equilateral (7);
		T.write ();
		System.out.println ();
		Equilateral T2 = new Equilateral (T);
		T2.write ();
		System.out.println ();
		T2.setSide (4);
		T2.write ();
		System.out.println ();
	}
    */
}
