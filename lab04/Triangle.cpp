// File: Triangle.cpp
// Author: Amandeep Gill
// Contents: This file contains the implementation for the Triangle Class

#include <string>
#include "Triangle.h"

using namespace std;

Triangle::Triangle()
{
    debug << "Entering default constructor for Triangle\n";
    side = 0;
    debug << "Exiting default constructor for Triangle\n";
}

string Triangle::Sides() const
{
    debug << "Entering Sides function for Triangle\n";
    debug << "Exiting Sides function for Triangle\n";
    return "3";
}

