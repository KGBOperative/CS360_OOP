#ifndef QUADRILATERAL_H
#define QUADRILATERAL_H

// File: Quadrilateral.h
// Author: Amandeep GIll
// Contents: this contains the header for the Quadrilateral class

#include <string>
#include "Shape.h"

class Quadrilateral : public Shape
{
    public:
        // The default constructor sets the value of side to 0.0
        Quadrilateral();

        // This function returns "4" - the number of sides in a quadrilateral
        string Sides() const;
};

#endif // QUADRILATERAL_H
