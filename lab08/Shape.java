// File: Shape.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a virtual class called Shape. 

import java.text.NumberFormat;
import java.awt.*;

public class Shape
{
    protected int centerX;
    protected int centerY;
	protected int side;

	public Shape ()
	{
		side = 0;
	}
	
	public Shape (Shape S)
	{
		side = S.side;
	}
	
	public double area ()
	{
		return 0;
	}
	
	public double perimeter ()
	{
		return 0;
	}
	
	public String sides ()
	{
		return "0";
	}

    public void paintComponent(Graphics2D g2) {}
	
	public void write ()
	{
   		NumberFormat nf = NumberFormat.getInstance();
   		nf.setMinimumFractionDigits(2);
   		nf.setMaximumFractionDigits(2);
		System.out.print (sides () + " sided shape; ");
		System.out.print (" with perimeter = " + nf.format(perimeter ()));
		System.out.print (" and area = " + nf.format(area ()));
	}

	public String getName ()
	{
		return "Shape";
	}

	public static void main (String [] args)
	{
		Shape S = new Shape ();
		S.write ();
		System.out.println ();
	}
}
