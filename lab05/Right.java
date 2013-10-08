// File: Right.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Right. 

import static java.lang.Math.*;

public final class Right extends Triangle
{
	private double side2;

	public Right ()
	{
		side2 = 0.0;
	}
	
	public Right (Right R)
	{
		side = R.side;
		side2 = R.side2;
	}
	
	public Right (double S1, double S2)
	{
		side = S1;
		side2 = S2;
	}
	
	public void setSide1 (double S1)
	{
		side = S1;
	}
	
	public double getSide1 ()
	{
		return side;
	}
	
	public void setSide2 (double S2)
	{
		side2 = S2;
	}
	
	public double getSide2 ()
	{
		return side2;
	}
	
	public double perimeter ()
	{
		return side + side2 + sqrt (side * side + side2 * side2);
	}
	
	public double area ()
	{
		return side * side2 / 2;
	}
	
	public String getName ()
	{
		return "Right";
	}

	public static void main (String [] args)
	{
		Right T = new Right ();
		T.write (); System.out.println ();
		T = new Right (7, 5);
		T.write (); System.out.println ();
		Right T2 = new Right (T);
		T2.write (); System.out.println ();
		T2.setSide1 (4.1);
		T2.setSide2 (1.3);
		T2.write (); System.out.println ();
	}
}	
	
