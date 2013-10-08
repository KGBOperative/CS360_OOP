#ifndef TRIANGLE_H
#define TRIANGLE_H

// File: Triangle.h
// Author: Aman Gill
// Contains: The header information of the Triangle class

#include <iostream>
using namespace std;

class Triangle
{
    public:
        // The default constructor
        Triangle();

        // This constructor sets the three sides of the triangle from the passed values
        Triangle(float s1, float s2, float s3);

        // These functions return the side of the triangle being requested
        float GetSide1();
        float GetSide2();
        float GetSide3();

        // These functions set the side of the triangle from the passed value
        void SetSide1(float s1);
        void SetSide2(float s2);
        void SetSide3(float s3);

		// This function prints the area contained by the triangle
		void WriteArea(ostream &outs) const;

	private:
		// This function checks that the sides form a valid triangle before setting the sides of the triangle
		void MakeTriangle(float s1, float s2, float s3);

		// The three sides of the triangle
		float side1;
		float side2;
		float side3;
};

#endif	// TRIANGLE_H
