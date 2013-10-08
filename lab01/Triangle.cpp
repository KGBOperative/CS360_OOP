// File: Triangle.cpp
// Author: Amandeep Gill
// Contains: the implementation of the Triangle class


#include "Triangle.h"
#include <cmath>

Triangle::Triangle()
{
    side1 = 0.0;
    side2 = 0.0;
    side3 = 0.0;
}

Triangle::Triangle(float s1, float s2, float s3)
{
    MakeTriangle(s1, s2, s3);
}

float Triangle::GetSide1()
{
    return side1;
}

float Triangle::GetSide2()
{
    return side2;
}

float Triangle::GetSide3()
{
    return side3;
}

void Triangle::SetSide1(float s1)
{
    MakeTriangle(s1, side2, side3);
}

void Triangle::SetSide2(float s2)
{
    MakeTriangle(side1, s2, side3);
}

void Triangle::SetSide3(float s3)
{
    MakeTriangle(side1, side2, s3);
}

void Triangle::WriteArea(ostream &outs) const
{
    float s = 0.5 * (side1 + side2 + side3);
    float a = sqrt(s * (s - side1) * (s - side2) * (s - side3));

    outs.setf(ios::showpoint);
    outs.setf(ios::fixed);
    outs.precision(2);

    outs << "The area of a triangle with sides of " <<
            side1 << ", " << side2 << ", and " << side3 <<
            " is " << a;
}

void Triangle::MakeTriangle(float s1, float s2, float s3)
{
    s1 = abs(s1);
    s2 = abs(s2);
    s3 = abs(s3);

    if (s1 > s2 && s1 > s3 && s2 + s3 < s1)
        s1 = s2 + s3;

    else if (s2 > s1 && s2 > s3 && s1 + s3 < s2)
        s2 = s1 + s3;

    else if (s3 > s1 && s3 > s1 && s1 + s2 < s3)
        s3 = s1 + s2;

    side1 = s1;
    side2 = s2;
    side3 = s3;
}


