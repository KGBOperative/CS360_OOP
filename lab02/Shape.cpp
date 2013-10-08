// File: Shape.cpp
// Author: Dr. Tia Watts
// Contents: This file contains the implementation of the virtual Shape Class

#include "Shape.h"

Shape::Shape()
{
    side = 0.0;
}

Shape::Shape(const Shape &S)
{
    side = S.side;
}

Shape::~Shape()
{
}

Shape & Shape::operator=(const Shape &S)
{
    if (this == &S)
        return *this;

    side = S.side;
    return *this;
}

float Shape::Area() const
{
    return 0;
}

float Shape::Perimeter() const
{
    return 0;
}

void Shape::WriteArea(ostream &outs) const
{
}

ostream & operator << (ostream &outs, const Shape &S) 
{
    S.WriteArea(outs);
    return outs;
}


