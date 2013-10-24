// File: Square.java
// Author: Amandeep Gill
// Contents: The decleration and implementation of the Square class

import java.awt.*;

public class Square extends Quadrilateral {

    public Square() {
    }

    public Square(int s, int x, int y) {
        side = s;
        centerX = x;
        centerY = y;
    }

    public Square(int s) {
        side = s;
    }

    @Override
    public void paintComponent(Graphics2D g2) {
		g2.setPaint (color);
        g2.fillRect(centerX-side/2, centerY-side/2, side, side);
        g2.fillRect(centerX-1, centerY-1, 2, 2);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
	public boolean isIn (int X, int Y) {
        int p1x = centerX-side/2;
        int p1y = centerY-side/2;
        int p2x = centerX+side/2;
        int p2y = centerY+side/2;
		return X >= p1x && X <= p2x && Y >= p1y && Y <= p2y;
	}

    public void fromString (String str) {
        String [] parts = str.split (" ");
        try {
            centerX = Integer.parseInt(parts[0]);
            centerY = Integer.parseInt(parts[1]);
            side = Integer.parseInt(parts[2]);
            color = new Color(Integer.parseInt(parts[3]));
            //setVertices ();
        }
        catch (NumberFormatException e) {
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
