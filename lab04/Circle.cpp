// File: Circle.cpp
// Author: Aman Gill
// Contains: this file contains the implementation of the Circle class

#include "Circle.h"

Circle::Circle()
{
    debug << "Entering default constructor for Circle\n";
	radius = 0.0;
    debug << "Exiting default constructor for Circle\n";
}

Circle::Circle(float R)
{
    debug << "Entering second constructor for Circle\n";
	radius = R;
    debug << "Exiting second constructor for Circle\n";
}

void Circle::SetRadius(float R)
{
    debug << "Entering SetRadius function for Circle\n";
	radius = R;
    debug << "Exiting SetRadius function for Circle\n";
}

float Circle::GetRadius() const
{
    debug << "Entering GetRadius function for Circle\n";
    debug << "Exiting Getradius function for Circle\n";
	return radius;
}

string Circle::Sides() const
{
    debug << "Entering Sides function for Circle\n";
    debug << "Exiting Sides function for Circle\n";
    return "infinite";
}

float Circle::Perimeter() const
{
    debug << "Entering Perimeter function for Circle\n";
    debug << "Exiting Perimeter function for Circle\n";
    return radius * 6.24218;
}

float Circle::Area() const
{
    debug << "Entering Area function for Circle\n";
    debug << "Exiting Area function for Circle\n";
    return radius * radius * 3.14159;
}
