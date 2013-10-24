// File: Circle.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Circle. 

import static java.lang.Math.*;
import java.awt.*;

public final class Circle extends Shape {
	public Circle () {
	}

	public Circle (int S, int X, int Y, Color C) {
		side = S;
		centerX = X;
		centerY = Y;
		color = C;
	}

	public Circle (Circle C) {
		side = C.side;
		centerX = C.centerX;
		centerY = C.centerY;
		color = C.color;
	}

	public void setRadius (int R) {
		side = R;
	}

	public int getRadius () {
		return side;
	}

	public double area () {
		return Math.PI * side * side;
	}

	public double perimeter () {
		return 2 * Math.PI * side;
	}

	public String getName () {
		return "Circle";
	}

	public void paintComponent (Graphics2D g2) {
		g2.setPaint (color);
		g2.fillOval (centerX-side, centerY-side, 2*side, 2*side);
		g2.drawOval (centerX-side, centerY-side, 2*side, 2*side);
		g2.setPaint (Color.BLACK);
		g2.fillOval (centerX-1, centerY-1, 2, 2); // Draw the center point
	}

	public boolean isIn (int X, int Y) {
		int deltaX = X - centerX;
		int deltaY = Y - centerY;
		double dist = sqrt (deltaX * deltaX + deltaY * deltaY);
		//System.out.println ("dist = " + dist + " side = " + side);
		return dist <= side;
	}

	public void fromString (String str) {
		String [] parts = str.split (" ");
		try
		{
			centerX = Integer.parseInt(parts[0]);
			centerY = Integer.parseInt(parts[1]);
			side = Integer.parseInt(parts[2]);
			color = new Color(Integer.parseInt(parts[3]));
		}
		catch (NumberFormatException e)
		{
			System.out.println ("File input error - invalid integer");;
		}
	}

	public String toString () {
		String string = new String ();
		string += centerX + " ";
		string += centerY + " ";
		string += side + " ";
		string += color.getRGB() + " ";
		return string;
	}
}
