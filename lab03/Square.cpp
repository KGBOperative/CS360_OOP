// File: Sqaure.cpp
// Author: Amandeep Gill
// Contents: the ipmlementation of the Square class

#include "Square.h"

using namespace std;

Square::Square()
{
    debug << "Entering default constructor for Square\n";
    side = 0.0;
    debug << "Exiting default constructor for Square\n";
}

Square::Square(float S)
{
    debug << "Entering second constructor for Square\n";
    side = S;
    debug << "Exiting second constructor for Square\n";
}

void Square::SetSide(float S)
{
    debug << "Entering SetSide function for Square\n";
    side = S;
    debug << "Exiting SetSide function for Square\n";
}

float Square::GetSide() const
{
    debug << "Entering GetSide function for Square\n";
    debug << "Exiting GetSide function for Square\n";
    return side;
}

float Square::Perimeter() const
{
    debug << "Entering Perimeter function for Square\n";
    debug << "Exiting Perimeter function for Square\n";
    return 4.0 * side;
}

float Square::Area() const
{
    debug << "Entering Area function for Square\n";
    debug << "Exiting Area function for Square\n";
    return side * side;
}


