// File: Equilateral.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Equilateral. 

import static java.lang.Math.*;

public final class Equilateral extends Triangle
{
	public Equilateral ()
	{
	}
	
	public Equilateral (Equilateral E)
	{
		side = E.side;
	}

	public Equilateral (double S)
	{
		side = S;
	}
	
	public void setSide (double S)
	{
		side = S;
	}
	
	public double getSide ()
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
		T2.setSide (4.1);
		T2.write ();
		System.out.println ();
	}
}
