// File: Lab04.cpp
// Author: Dr. Watts
// Contents: This file contains an application program
// to test the classes in the Shape hierarchy. Currently this
// program reads information about shapes from a file and
// stores the in a vector. It then uses the overloaded output
// operator to print information about the shapes in the
// vector. It also prints the totals for the areas, perimeters,
// and number of sides of the shapes.

#include <iostream>
#include <fstream>
#include <cstdlib>
#include <vector>
#include "Shape.h"
#include "Circle.h"
#include "Rectangle.h"
#include "Scalene.h"
#include "Right.h"
#include "Square.h"
#include "Equilateral.h"
using namespace std;

Circle * MakeCircle (istream & ins);
Rectangle * MakeRectangle (istream & ins);
Scalene * MakeScalene (istream & ins);
Right * MakeRight (istream & ins);
Square * MakeSquare (istream & ins);
Equilateral * MakeEquilateral (istream & ins);

int main (int argc, char * argv[])
{
	
	if (argc < 2)
	{
		cerr << "Usage: " << argv[0] << " <filename>\n";
		exit (1);
	}
	ifstream fin (argv[1]);
	if (fin.fail())
	{
		cerr << "File: " << argv[1] << " not found\n";
		exit (2);
	}
	int choice;
	vector <Shape *> S;
	do
	{
		fin >> choice;
		switch (choice)
		{
			case 1: S.push_back (MakeCircle(fin)); break;
			case 2: S.push_back (MakeRectangle(fin)); break;
			case 3: S.push_back (MakeScalene(fin)); break;
			case 4: S.push_back (MakeRight(fin)); break;
			case 5: S.push_back (MakeSquare(fin)); break;
			case 6: S.push_back (MakeEquilateral(fin)); break;
		}
	} while (choice);
	for (int i = 0; i < S.size(); i++)
		cout << "Shape " << i << " is a " << *S[i] << endl;
	float totalPerim = 0;
	float totalArea = 0;
	string totalSides;
	for (int i = 0; i < S.size(); i++)
	{
		totalPerim += S[i]->Perimeter();
		totalArea += S[i]->Area();
		totalSides += S[i]->Sides();
	}
	cout << "Total perimeter = " << totalPerim << endl;
	cout << "Total area = " << totalArea << endl;
	cout << "Total sides = " << totalSides << endl;
	return 0;
}

Circle * MakeCircle (istream & ins)
{
	float radius;
	ins >> radius;
	Circle * C = new Circle (radius);
	return C;
}

Rectangle * MakeRectangle (istream & ins)
{
	float length, width;
	ins >> length >> width;
	Rectangle * R = new Rectangle (length, width);
	return R;
}

Right * MakeRight (istream & ins)
{
	float side1, side2;
	ins >> side1 >> side2;
	Right * T = new Right (side1, side2);
	return T;
}

Scalene * MakeScalene (istream & ins)
{
	float side1, side2, side3;
	ins >> side1 >> side2 >> side3;
	Scalene * T = new Scalene (side1, side2, side3);
	return T;
}

Square * MakeSquare (istream & ins)
{
	float side;
	ins >> side;
	Square * S = new Square (side);
	return S;
}

Equilateral * MakeEquilateral (istream & ins)
{
	float side;
	ins >> side;
	Equilateral * T = new Equilateral (side);
	return T;
}

