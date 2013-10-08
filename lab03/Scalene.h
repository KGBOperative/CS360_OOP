#ifndef SCALENE_H
#define SCALENE_H

// File: Scalene.h
// Author: Aman Gill
// Contains: The header information of the Scalene class

#include <iostream>
#include "Triangle.h"
using namespace std;

class Scalene : public Triangle 
{
    public:
        // The default constructor
        Scalene();

        // This constructor sets the three sides of the scalene from the passed values
        Scalene(float s1, float s2, float s3);

        // These functions return the side of the scalene being requested
        float GetSide1() const;
        float GetSide2() const;
        float GetSide3() const;

        // These functions set the side of the scalene from the passed value
        void SetSide1(float s1);
        void SetSide2(float s2);
        void SetSide3(float s3);

        // This function computes and returns the perimeter of the scalene
        float Perimeter() const;

        // This function computes and returns the area of the scalene
        float Area() const;

	private:
		// This function checks that the sides form a valid scalene before setting the sides of the scalene
		void MakeScalene(float s1, float s2, float s3);

		// The three sides of the scalene
		float side2;
		float side3;
};

#endif	// SCALENE_H
