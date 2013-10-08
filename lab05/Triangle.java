// File: Triangle.java
// Author: Dr. Watts
// Contents: This file contains the description and implementation
// of a class called Triangle. 

public class Triangle extends Shape
{
	Triangle ()
	{
	}

	public String sides ()
	{
		return "3";
	}
	
	public String getName ()
	{
		return "Triangle";
	}

	public static void main (String [] args)
	{
		Triangle T = new Triangle ();
		T.write ();
		System.out.println ();
	}
}
