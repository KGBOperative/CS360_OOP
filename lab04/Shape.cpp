// File: Shape.cpp
// Author: Dr. Tia Watts
// Contents: This file contains the implementation of the virtual Shape Class

#include "Shape.h"

Shape::Shape()
{
    debug << "Entering default constructor for Shape\n";
    side = 0.0;
    debug << "Exiting default constructor for Shape\n";
}

Shape::Shape(const Shape &S)
{
    debug << "Entering second constructor for Shape\n";
    side = S.side;
    debug << "Exiting second constructor for Shape\n";
}

Shape::~Shape()
{
    debug << "Entering default desturctor for Shape\n";
    debug << "Exiting default destructor for Shape\n";
}

Shape & Shape::operator=(const Shape &S)
{
    debug << "Entering operator= for Shape\n";
    if (this == &S)
    {
        debug << "Exiting operator= for Shape\n";
        return *this;
    }

    side = S.side;
    debug << "Exiting operator= for Shape\n";
    return *this;
}

float Shape::Area() const
{
    debug << "Entering Area function for Shape\n";
    debug << "Exiting Area function for Shape\n";
    return 0;
}

float Shape::Perimeter() const
{
    debug << "Entering Perimeter function for Shape\n";
    debug << "Exiting Perimeter function for Shape\n";
    return 0;
}

string Shape::Sides() const
{
    debug << "Entering Sides function for Shape\n";
    debug << "Exiting Sides function for Shape\n";
    return "1";
}

ostream & operator << (ostream &outs, const Shape &S) 
{
    debug << "Entering operator<< for Shape\n";
    outs << S.Sides() << "-sided shape; with perimeter = " << S.Perimeter() << " and area = " << S.Area();
    debug << "Exiting operator<< for Shape\n";
    return outs;
}


