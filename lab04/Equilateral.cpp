// File: Equilateral.cpp
// Author: Amandeep Gill
// Contents: this file contains the implementation of the Equilateral class

#include <cmath>
#include "Equilateral.h"

using namespace std;

Equilateral::Equilateral()
{
    debug << "Entering default constructor for Equilateral\n";
    side = 0.0;
    debug << "Exiting default constructor for Equilateral\n";
}

Equilateral::Equilateral(float S)
{
    debug << "Entering second constructor for Equilateral\n";
    side = S;
    debug << "Exiting second constructor for Equilateral\n";
}

float Equilateral::GetSide() const
{
    debug << "Entering GetSide function for Equilateral\n";
    debug << "Exiting GetSide function for Equilateral\n";
    return side;
}

void Equilateral::SetSide(float S)
{
    debug << "Entering SetSide function for Equilateral\n";
    side = S;
    debug << "Exiting SetSide function for Equilateral\n";
}

float Equilateral::Perimeter() const
{
    debug << "Entering Perimeter function for Equilateral\n";
    debug << "Exiting Perimeter function for Equilateral\n";
    return 3 * side;
}

float Equilateral::Area() const
{
    debug << "Entering Area function for Equilateral\n";
    debug << "Exiting Area function for Equilateral\n";
    return side * side * sqrt(3.0) / 4.0;
}
