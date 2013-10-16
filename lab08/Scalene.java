// File: Scalene.java
// Author: Amandeep Gill
// Contents: the declaration and implementation of the Scalene class

import static java.lang.Math.*;
import java.awt.*;

public class Scalene extends Triangle {
    private int side2;
    private int side3;
    private int centerX;
    private int centerY;

    public Scalene() {
    }

    public Scalene(int s1, int s2, int s3, int x, int y) {
        side = s1;
        side2 = s2;
        side3 = s3;

        centerX = x;
        centerY = y;
    }

    @Override
    public String getName() {
        return "Scalene";
    }

    @Override
    public double area() {
        double s = perimeter()/2;
        return sqrt(s * (s - side) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side + side2 + side3;
    }

    public void setSide2(int s2) {
        side2 = s2;
    }

    public void setSide3(int s3) {
        side3 = s3;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
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
            side3 = Integer.parseInt(parts[4]);
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
		string += side3 + " ";
		string += color.getRGB() + " ";
		return string;
	}

    @Override
    public void paintComponent(Graphics2D g2)  {
        int x1[] = new int[3];
        int y1[] = new int[3];

        double radius = 2 * area() / perimeter();
        double s = perimeter() / 2;
        double height = 2 * area() / side;
        double length = sqrt(side2 * side2 - height * height);

        length = (side2 < side3) ? -length : length;

        int xo = centerX - (int)((side * length + side * side2) / perimeter());
        int yo = centerY + (int)radius;

        x1[0] = (int)(xo);
        y1[0] = (int)(yo);
        x1[1] = (int)(xo + side);
        y1[1] = (int)(yo);
        x1[2] = (int)(xo + length);
        y1[2] = (int)(yo - height);

        int x2[] = {centerX, centerX+1, centerX-1};
        int y2[] = {centerY-1, centerY+1, centerY+1};

        g2.drawPolygon(x1, y1, 3);
        g2.drawPolygon(x2, y2, 3);
    }
}
