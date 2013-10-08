// File: Right.h
// Author: Amandeep Gill
// Contents: the implementation of the Right class

#include <cmath>
#include "Right.h"

using namespace std;

Right::Right()
{
    debug << "Entering default constructor for Right\n";
    side = 0.0;
    side2 = 0.0;
    debug << "Exiting default constructor for Right\n";
}

Right::Right(float S1, float S2)
{
    debug << "Entering second constructor for Right\n";
    side = S1;
    side2 = S2;
    debug << "Exiting second constructor for Right\n";
}

float Right::GetSide1() const
{
    debug << "Entering GetSide1 function for Right\n";
    debug << "Exiting GetSide1 function for Right\n";
    return side;
}

float Right::GetSide2() const
{
    debug << "Entering GetSide2 function for Right\n";
    debug << "Exiting GetSide2 function for Right\n";
    return side2;
}

void Right::SetSide1(float S)
{
    debug << "Entering SetSide1 function for Right\n";
    side = S;
    debug << "Exiting SetSide1 function for Right\n";
}

void Right::SetSide2(float S)
{
    debug << "Entering SetSide2 function for Right\n";
    side2 = S;
    debug << "Exiting SetSide2 function for Right\n";
}

float Right::Perimeter() const
{
    debug << "Entering Perimeter function for Right\n";
    debug << "Exiting Perimeter function for Right\n";
    return side + side2 + sqrt(side*side + side2*side2);
}

float Right::Area() const
{
    debug << "Entering Area function for Right\n";
    debug << "Exiting Area function for Right\n";
    return 0.5 * (side + side2);
}
