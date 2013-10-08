#ifndef CIRCLE_H
#define CIRCLE_H

// File: Circle.h
// Author: Dr. Watts
// Contects: This file contains the description of a class call Circle

#include <iostream>
using namespace std; 

class Circle
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

	private:
		// The length of the radius
		float radius;
};

#endif

