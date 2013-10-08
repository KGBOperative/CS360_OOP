// File: Rectangle.cpp
// Author: Amandeep Gill
// Contains: The implementation of the Rectangle class

#include "Rectangle.h"

Rectangle::Rectangle()
{
    debug << "Entering default constructor for Rectangle\n";
    side = 0.0;
    width = 0.0;
    debug << "Exiting default constructor for Rectangle\n";
}

Rectangle::Rectangle(float l, float w)
{
    debug << "Entering second constructor for Rectangle\n";
    MakeRectangle(l, w);
    debug << "Exiting second constructor for Rectangle\n";
}

float Rectangle::GetLength()
{
    debug << "Entering GetLength function for Rectangle\n";
    debug << "Exiting GetLength function for Rectangle\n";
    return side;
}

float Rectangle::GetWidth()
{
    debug << "Entering GetWidth function for Rectangle\n";
    debug << "Exiting GetWidth function for Rectangle\n";
    return width;
}

void Rectangle::SetLength(float l)
{
    debug << "Entering SetLength function for Rectangle\n";
    MakeRectangle(l, width);
    debug << "Exiting SetLength function for Rectangle\n";
}

void Rectangle::SetWidth(float w)
{
    debug << "Entering SetWidth function for Rectangle\n";
    MakeRectangle(side, w);
    debug << "Exiting SetWidth function for Rectangle\n";
}

void Rectangle::MakeRectangle(float l, float w)
{
    debug << "Entering MakeRectangle function for Rectangle\n";
    if (l < 0.0)
        l *= -1.0;

    if (w < 0.0)
        w *= -1.0;

    side = l;
    width = w;
    debug << "Exiting MakeRectangle function for Rectangle\n";
}

float Rectangle::Perimeter() const
{
    debug << "Entering Perimeter function for Rectangle\n";
    debug << "Exiting Perimeter function for Rectangle\n";
    return 2 * (side + width);
}

float Rectangle::Area() const
{
    debug << "Entering Area function for Rectangle\n";
    debug << "Exiting Area function for Rectangle\n";
    return side + width;
}
