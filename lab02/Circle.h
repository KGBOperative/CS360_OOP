#ifndef CIRCLE_H
#define CIRCLE_H

// File: Circle.h
// Author: Dr. Watts
// Contects: This file contains the description of a class call Circle

#include <iostream>
#include "Shape.h"
using namespace std; 

class Circle : public Shape
{
	public:
		// The default constructor will set the raduis to 0.0
		Circle();

		// This constructor will set the radius to the value passed
		Circle(float R);

		// This mutator function will set the radius to the passed value
		void SetRadius(float R);

		// This accessor function will return the length of the radius
		float GetRadius() const;

		// This function will write the radius and area of the circle
		void WriteArea(ostream &outs) const;

        // This function will compute and return the perimeter of the circle
        float Perimeter() const;

        // This function will compute and return the area of the circle
        float Area() const;

	private:
		// The length of the radius
		float radius;
};

#endif

