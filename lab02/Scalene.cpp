// File: Scalene.cpp
// Author: Amandeep Gill
// Contains: the implementation of the Scalene class


#include "Scalene.h"
#include <cmath>

Scalene::Scalene()
{
    side1 = 0.0;
    side2 = 0.0;
    side3 = 0.0;
}

Scalene::Scalene(float s1, float s2, float s3)
{
    MakeScalene(s1, s2, s3);
}

float Scalene::GetSide1()
{
    return side1;
}

float Scalene::GetSide2()
{
    return side2;
}

float Scalene::GetSide3()
{
    return side3;
}

void Scalene::SetSide1(float s1)
{
    MakeScalene(s1, side2, side3);
}

void Scalene::SetSide2(float s2)
{
    MakeScalene(side1, s2, side3);
}

void Scalene::SetSide3(float s3)
{
    MakeScalene(side1, side2, s3);
}

void Scalene::WriteArea(ostream &outs) const
{
    float s = 0.5 * (side1 + side2 + side3);
    float a = sqrt(s * (s - side1) * (s - side2) * (s - side3));

    outs.setf(ios::showpoint);
    outs.setf(ios::fixed);
    outs.precision(2);

    outs << "The area of a scalene with sides of " <<
            side1 << ", " << side2 << ", and " << side3 <<
            " is " << a;
}

void Scalene::MakeScalene(float s1, float s2, float s3)
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

float Scalene::Perimeter() const
{
    return side1 + side2 + side3;
}

float Scalene::Area() const
{
    float s = 0.5 * (side1 + side2 + side3);
    return sqrt(s * (s - side1) * (s - side2) * (s - side3));
}
