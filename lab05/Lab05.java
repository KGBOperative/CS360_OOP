// File: Lab05.java
// Author: Dr. Watts
// Contents: This file contains an application program
// to test the classes in the Shape hierarchy. Currently this
// program reads information about shapes from a file and
// stores them in an ArrayList. It then uses the Shape class
// write method to print information about the shapes in the
// array list.

import java.io.*;
import java.util.*;

class Lab05
{
	private Lab05 (BufferedReader input)
	{
		ArrayList <Shape> S = new ArrayList <Shape> ();
        ArrayList<Shape> SortedS = new ArrayList<Shape>();

		int choice = 0;
		do
		{
			choice = readInt (input);
			switch (choice)
			{
				case 1: 
                    Circle circle = MakeCircle(input);
                    S.add (circle); 
                    SortedS.add(circle);
                    break;
				case 2: 
                    Rectangle rect = MakeRectangle(input);
                    S.add (rect); 
                    SortedS.add(rect);
                    break;
				case 3: 
                    Scalene scalene = MakeScalene(input);
                    S.add (scalene); 
                    SortedS.add(scalene);
                    break;
				case 4: 
                    Right right = MakeRight(input);
                    S.add (right); 
                    SortedS.add(right);
                    break;
				case 5:
                    Square square = MakeSquare(input);
                    S.add (square); 
                    SortedS.add(square);
                    break;
				case 6:
                    Equilateral equil = MakeEquilateral(input);
                    S.add (equil); 
                    SortedS.add(equil);
                    break;
			}
		} while (choice != 0);

        Collections.sort(SortedS, ShapeComparator.SHAPE_ORDER);

        double perimeter = 0.0;
        double area = 0.0;
        String shape = new String();
		
        for (int i = 0; i < SortedS.size (); i++)
		{
            if (i == 0) {
                shape = SortedS.get(i).sides();
            }

            else if (shape.compareTo(SortedS.get(i).sides()) != 0) {
                System.out.println("Total Perimeter = " + perimeter);
                System.out.println("Total Area = " + area + "\n");

                shape = SortedS.get(i).sides();
                perimeter = 0.0;
                area = 0.0;
            }

            perimeter += SortedS.get(i).perimeter();
            area += SortedS.get(i).area();

			System.out.print (SortedS.get(i).getName() + " " + i + " is a ");
			SortedS.get(i).write ();
			System.out.println ();
		}

        System.out.println();

        for (int i = 0; i < S.size(); i++) {
			System.out.print ("Shape " + i + " is a ");
			S.get(i).write ();
			System.out.println ();
        }
	}
	
	public static void main (String [] args)
	{
		if (args.length < 1)
		{
			System.out.println ("Usage: java Lab05 <filename>");
		}
		else try
		{
			BufferedReader file = new BufferedReader (new FileReader (args[0]));
			Lab05 lab05 = new Lab05 (file);
			file.close ();
		}
		catch (IOException e)
		{
			System.out.println ("File: " + args[0] + " cannot be opened");
		}
	}

	private Right MakeRight (BufferedReader ins)
	{
		double side1, side2;
		side1 = readDouble (ins);
		side2 = readDouble (ins);
		Right T = new Right (side1, side2);
		return T;
	}

    private Circle MakeCircle(BufferedReader ins)
    {
        double side;
        side = readDouble(ins);

        Circle C = new Circle(side);
        return C;
    }

    private Rectangle MakeRectangle(BufferedReader ins) 
    {
        double s1, s2;
        s1 = readDouble(ins);
        s2 = readDouble(ins);

        Rectangle R = new Rectangle(s1, s2);
        return R;
    }

    private Scalene MakeScalene(BufferedReader ins)
    {
        double s1, s2, s3;
        s1 = readDouble(ins);
        s2 = readDouble(ins);
        s3 = readDouble(ins);

        Scalene S = new Scalene(s1, s2, s3);
        return S;
    }

    private Square MakeSquare(BufferedReader ins)
    {
        double s;
        s = readDouble(ins);

        Square S = new Square(s);
        return S;
    }

	private Equilateral MakeEquilateral (BufferedReader ins)
	{
		double side;
		side = readDouble (ins);
		Equilateral T = new Equilateral (side);
		return T;
	}

	private int readInt (BufferedReader in)
	{
		String str = new String ();
		char c;
		try
		{
			do 
			{
				c = (char) in.read ();
			} while (c == ' ' || c == '\t' || c == '\n' || c == '\r');
			do
			{
				str += c;
				c = (char) in.read ();
			} while (c != ' ' && c != '\t' && c != '\n' && c != '\r');
		}
		catch (IOException e)
		{
			System.out.println ("File input error");;
		}
		int i = 0;
		try
		{
			i = Integer.parseInt(str);
		}
		catch (NumberFormatException e)
		{
			System.out.println ("File input error - invalid integer");;
		}
		return i;
	}
	
	private double readDouble (BufferedReader in)
	{
		String str = new String ();
		char c;
		try
		{
			do 
			{
				c = (char) in.read ();
			} while (c == ' ' || c == '\t' || c == '\n' || c == '\r');
			do
			{
				str += c;
				c = (char) in.read ();
			} while (c != ' ' && c != '\t' && c != '\n' && c != '\r');
		}
		catch (IOException e)
		{
			System.out.println ("File input error");;
		}
		double d = 0;
		try
		{
			d = Double.parseDouble(str);
		}
		catch (NumberFormatException e)
		{
			System.out.println ("File input error - invalid double");;
		}
		return d;
	}
}
