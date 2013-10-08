// File: Rectangle.cpp
// Author: Amandeep Gill
// Contains: The implementation of the Rectangle class

#include "Rectangle.h"

Rectangle::Rectangle()
{
    length = 0.0;
    width = 0.0;
}

Rectangle::Rectangle(float l, float w)
{
    MakeRectangle(l, w);
}

float Rectangle::GetLength()
{
    return length;
}

float Rectangle::GetWidth()
{
    return width;
}

void Rectangle::SetLength(float l)
{
    MakeRectangle(l, width);
}

void Rectangle::SetWidth(float w)
{
    MakeRectangle(length, w);
}

void Rectangle::WriteArea(ostream &outs) const
{
    float a = length * width;

    outs.setf(ios::showpoint);
    outs.setf(ios::fixed);
    outs.precision(2);

    outs << "The area of a rectangle with sides " << length <<
            " and " << width << " is " << a;
}

void Rectangle::MakeRectangle(float l, float w)
{
    if (l < 0.0)
        l *= -1.0;

    if (w < 0.0)
        w *= -1.0;

    length = l;
    width = w;
}

