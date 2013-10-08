// File: Scalene.cpp
// Author: Amandeep Gill
// Contains: the implementation of the Scalene class


#include "Scalene.h"
#include <cmath>

Scalene::Scalene()
{
    debug << "Entering default constructor for Scalene\n";
    side = 0.0;
    side2 = 0.0;
    side3 = 0.0;
    debug << "Exiting default constructor for Scalene\n";
}

Scalene::Scalene(float s1, float s2, float s3)
{
    debug << "Entering second constructor for Scalene\n";
    MakeScalene(s1, s2, s3);
    debug << "Exiting second constructor for Scalene\n";
}

float Scalene::GetSide1() const
{
    debug << "Entering GetSide1 function for Scalene\n";
    debug << "Exiting GetSide1 function for Scalene\n";
    return side;
}

float Scalene::GetSide2() const
{
    debug << "Entering GetSide2 function for Scalene\n";
    debug << "Exiting GetSide2 function for Scalene\n";
    return side2;
}

float Scalene::GetSide3() const
{
    debug << "Entering GetSide3 function for Scalene\n";
    debug << "Exiting GetSide3 function for Scalene\n";
    return side3;
}

void Scalene::SetSide1(float s1)
{
    debug << "Entering SetSide1 function for Scalene\n";
    MakeScalene(s1, side2, side3);
    debug << "Exiting SetSide1 function for Scalene\n";
}

void Scalene::SetSide2(float s2)
{
    debug << "Entering SetSide2 function for Scalene\n";
    MakeScalene(side, s2, side3);
    debug << "Exiting SetSide2 function for Scalene\n";
}

void Scalene::SetSide3(float s3)
{
    debug << "Entering SetSide3 function for Scalene\n";
    MakeScalene(side, side2, s3);
    debug << "Exiting SetSide3 function for Scalene\n";
}

void Scalene::MakeScalene(float s1, float s2, float s3)
{
    debug << "Entering MakeScalene function for Scalene\n";
    s1 = abs(s1);
    s2 = abs(s2);
    s3 = abs(s3);

    if (s1 > s2 && s1 > s3 && s2 + s3 < s1)
        s1 = s2 + s3;

    else if (s2 > s1 && s2 > s3 && s1 + s3 < s2)
        s2 = s1 + s3;

    else if (s3 > s1 && s3 > s1 && s1 + s2 < s3)
        s3 = s1 + s2;

    side = s1;
    side2 = s2;
    side3 = s3;
    debug << "Exiting MakeScalene function for Scalene\n";
}

float Scalene::Perimeter() const
{
    debug << "Entering Perimeter function for Scalene\n";
    debug << "Exiting Perimeter function for Scalene\n";
    return side + side2 + side3;
}

float Scalene::Area() const
{
    debug << "Entering Area function for Scalene\n";
    float s = 0.5 * (side + side2 + side3);
    debug << "Exiting Area function for Scalene\n";
    return sqrt(s * (s - side) * (s - side2) * (s - side3));
}
