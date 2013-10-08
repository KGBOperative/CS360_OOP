#ifndef EQUILATERAL_H
#define EQUILATERAL_H

// File: Equilateral.h
// Author: Amandeep Gill
// Contents: this file contains the header for the Equilateral class

#include "Triangle.h"

class Equilateral : public Triangle
{
    public:
        // The default constructor sets all sides to 0.0
        Equilateral();

        // This constructor sets all sides to the side passed
        Equilateral(float S);

        // This function returns the value of the sides
        float GetSide() const;

        // This function sets the sides to the value passed
        void SetSide(float S);

        // This function calculates and returns the perimeter of the triangle
        float Perimeter() const;

        // This function calculates and returns the area of the triangle
        float Area() const;
};

#endif // EQUILATERAL_H
