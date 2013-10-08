#ifndef SQUARE_H
#define SQUARE_H

// File: Square.h
// Author: Amandeep Gill
// Contents: the header for the Square class

#include "Quadrilateral.h"

using namespace std;

class Square : public Quadrilateral
{
    public:
        // The default constructor sets the side to 0
        Square();

        // This constructor sets the sides to the value passed
        Square(float S);

        // This function returns the value of the sides of the square
        float GetSide() const;

        // This function sets the sides to the value passed
        void SetSide(float S);

        // This function computes and returns the perimeter of the square
        float Perimeter() const;

        // This function computes and returns the area of the square
        float Area() const;
};

#endif // SQUARE_H
