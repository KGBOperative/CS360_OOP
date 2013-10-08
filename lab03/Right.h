#ifndef RIGHT_H
#define RIGHT_H

// File: Right.h
// Author: Amandeep Gill
// Contents: the header information for the Right class

#include "Triangle.h"

using namespace std;

class Right : public Triangle
{
    public:
        // The default constructor sets all sides to 0.0
        Right();

        // This constructor sets the sides to the values passed
        Right(float S1, float S2);

        // This function returns the value of the first side
        float GetSide1() const;

        // This function returns the value of the second side
        float GetSide2() const;

        // This function sets the first side to the value passed
        void SetSide1(float S);

        // This function sets the second side to the value passed
        void SetSide2(float S);

        // This function calculates and returns the perimeter of the triangle
        float Perimeter() const;

        // This function calculates and returns the area of the triangle
        float Area() const;

    private:
        float side2;
};

#endif // RIGHT_H
