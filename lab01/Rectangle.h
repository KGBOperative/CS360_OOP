#ifndef RECTANGLE_H
#define RECTANGLE_H

// File: Rectangle.h
// Author: Amandeep Gill
// Contains: The header information for the Rectangle class

#include <iostream>
using namespace std;

class Rectangle
{
    public:
        // The default constructor
        Rectangle();

        // This constructor sets the length and width to the values passed
        Rectangle(float l, float w);

        // These functions set the length and width to the values passed
        void SetLength(float l);
        void SetWidth(float w);

        // These functions return the length and width as requested
        float GetLength();
        float GetWidth();

        // This function writes the dimensions and area of the rectangle
        void WriteArea(ostream &outs) const;

    private:
        // This function checks that the dimensions of the rectangle are valid
        void MakeRectangle(float l, float w);

        float length;
        float width;
};

#endif // RECTANGLE_H
