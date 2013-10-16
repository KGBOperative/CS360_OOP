// File: Rectangle.java
// Author: Amandeep Gill
// Contents: the declaration and implementation of the Rectangle class

import java.awt.*;

public class Rectangle extends Quadrilateral {
    public Rectangle() {
    }

    public Rectangle(int s1, int s2, int x, int y) {
        side = s1;
        side2 = s2;
        centerX = x;
        centerY = y;
    }

    @Override
    public void paintComponent(Graphics2D g2) {
        g2.drawRect(centerX-1, centerY-1, 2, 2);
        g2.drawRect(centerX-side/2, centerY-side2/2, side, side2);
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
			side2 = Integer.parseInt(parts[3]);
			color = new Color(Integer.parseInt(parts[4]));
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
		string += side2 + " ";
		string += color.getRGB() + " ";
		return string;
	}

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double area() {
        return side * side2;
    }

    @Override
    public double perimeter() {
        return 2 * side * side2;
    }
}
