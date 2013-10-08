// File: Circle.cpp
// Author: Aman Gill
// Contains: this file contains the implementation of the Circle class

#include "Circle.h"

Circle::Circle()
{
	radius = 0.0;
}

Circle::Circle(float R)
{
	radius = R;
}

void Circle::SetRadius(float R)
{
	radius = R;
}

float Circle::GetRadius() const
{
	return radius;
}

void Circle::WriteArea(ostream &outs) const
{
	float area = radius * radius * 3.14159;

    outs.setf(ios::showpoint);
    outs.setf(ios::fixed);
    outs.precision(2);

	outs << "The area of a circle with radius " <<
		radius << " is " << area;
}

