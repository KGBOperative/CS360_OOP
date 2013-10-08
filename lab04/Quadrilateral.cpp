// File: Quadrilateral.h
// Author: Amandeep Gill
// Contents: the implementation of the Quadrilateral class

#include <string>
#include "Quadrilateral.h"

Quadrilateral::Quadrilateral()
{
    debug << "Entering default constructor for Quadrilateral\n";
    side = 0;
    debug << "Exiting default constructor for Quadrilateral\n";
}

string Quadrilateral::Sides() const
{
    debug << "Entering Sides function for Quadrilateral\n";
    debug << "Exiting Sides function for Quadrilateral\n";
    return "4";
}
