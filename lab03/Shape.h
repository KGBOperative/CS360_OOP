#ifndef SHAPE_H
#define SHAPE_H

#define DEBUG 0
#define debug if (DEBUG) cout

// File: Shape.h
// Author: Dr. Tia Watts
// Contains: This file contains a virtual class named Shape

#include <iostream>
#include <string>
using namespace std;

class Shape
{
    public:
        // The default constructor creates a Shape object with side 0.0
        Shape();

        // This constructor creates a Shape object with identicle properties
        // to the passed Shape object
        Shape(const Shape &S);

        // This destructor currenlty does nothing
        ~Shape();

        // This assignment operator will make this Shape object identicle to
        // the Shape object being referenced
        Shape & operator = (const Shape &s);

        // This function computes and returns the Area of the Shape
        virtual float Area() const;

        // This function computes and returns the Perimeter of the Shape
        virtual float Perimeter() const;

        // This function returns the number of sides in the shape
        virtual string Sides() const;
        
        // The output operator outputs pertinant information about the Shape
        friend ostream & operator << (ostream &outs, const Shape &S);

    protected:
        float side;

    private:
};

#endif  // SHAPE_H
