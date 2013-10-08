// File: Lab01-tri.cpp
// Author: Amandeep Gill
// Contents: this file contains an application program
// to test the Rectangle class.

#include <iostream>
#include "Circle.h"
#include "Rectangle.h"
#include "Triangle.h"
using namespace std;

int main()
{
    Circle c1;
    c1.WriteArea(cout);
    cout << endl;

    Circle c2(5.2);
    c2.WriteArea(cout);
    cout << endl;

    c1.SetRadius(3.7);
    c1.WriteArea(cout);
    cout << endl;

    cout << "The radius is " << c2.GetRadius() << endl;

    Rectangle r1;
    r1.WriteArea(cout);
    cout << endl;

    Rectangle r2(4.0, 5.0);
    r2.WriteArea(cout);
    cout << endl;

    r2.SetWidth(8.0);
    r2.WriteArea(cout);
    cout << endl;

    cout << "The sides of r2 are " << r2.GetLength() << ", and " << r2.GetWidth() << endl;

    Triangle t1;
    t1.WriteArea(cout);
    cout << endl;

    Triangle t2(3.0, 4.0, 5.0);
    t2.WriteArea(cout);
    cout << endl;

    t2.SetSide3(8.0);
    t2.WriteArea(cout);
    cout << endl;

    cout << "The sides of t2 are " << t2.GetSide1() << ", " << t2.GetSide2() <<
            ", and " << t2.GetSide3() << endl;

	return 0;
}
