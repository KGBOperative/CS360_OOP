#ifndef TRIANGLE_H
#define TRIANGLE_H

// File: Triangle.h
// Author: Amandeep Gill
// Contents: this file contains the header information for the Triangle class

#include "Shape.h"

class Triangle : public Shape
{
    public:
        // The default constructor will set the return value of side to 0.0
        Triangle();

        // This accessor function will return "3" - the number of sides in a triangle
        string Sides() const;
};

#endif // TRIANGLE_H
