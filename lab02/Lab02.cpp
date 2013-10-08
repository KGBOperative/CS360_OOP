// File: Lab02.cpp
// Author: Dr. Tia Watts
// Contents: This file contains an application program to test the Rectangle, Circle, and Scalene Classes

#include <vector>
#include <iostream>

#include "Shape.h"
#include "Circle.h"
#include "Rectangle.h"
#include "Scalene.h"

using namespace std;

int menu();
Circle MakeCircle();
Rectangle MakeRectangle();
Scalene MakeScalene();

int main()
{
    int choice;
    vector<Shape *> S;

    do 
    {
        choice = menu();
        switch (choice)
        {
        case 1: 
            S.push_back(new Circle(MakeCircle()));
            break;
        case 2:
            S.push_back(new Rectangle(MakeRectangle()));
            break;
        case 3:
            S.push_back(new Scalene(MakeScalene()));
            break;
        }
    } while (choice != 4);

    for (unsigned int i = 0; i < S.size(); ++i)
        cout << *S[i] << endl;

    return 0;
}

int menu()
{
    char selection;
    int choice;

    cout << "Select one of the following options:\n";
    cout << "\t1) Create a Circle\n";
    cout << "\t2) Create a Rectangle\n";
    cout << "\t3) Create a Scalene\n";
    cout << "\t4) Quit\n";
    cin >> selection;

    if (selection == '1' || selection == 'c' || selection == 'C')
        return 1;
    else if (selection == '2' || selection == 'r' || selection == 'R')
        return 2;
    else if (selection == '3' || selection == 's' || selection == 'S')
        return 3;
    else if (selection == '4' || selection == 'q' || selection == 'Q')
        return 4;
    return -1;
}

Circle MakeCircle()
{
    float radius;

    cout << "Please enter the radius of the Circle: ";
    cin >> radius;

    Circle C(radius);

    cout << "You have created a Circle with radius = ";
    cout << C.GetRadius() << endl;
    cout << "The Perimeter is " << C.Perimeter() << " and the Area is ";
    cout << C.Area() << endl;

    return C;
}

Rectangle MakeRectangle()
{
    float l;
    float w;

    cout << "Please enter the length of the Rectangle followed by the width: ";
    cin >> l;
    cin >> w;

    Rectangle R(l, w);

    cout << "You have created a Rectangle with dimensions ";
    cout << R.GetLength() << "x" << R.GetWidth() << endl;
    cout << "The Perimeter is " << R.Perimeter() << " and the Area is ";
    cout << R.Area() << endl;

    return R;
}

Scalene MakeScalene()
{
    float s1;
    float s2;
    float s3;

    cout << "Please enter the three sides of the Scalene: ";
    cin >> s1;
    cin >> s2;
    cin >> s3;

    Scalene S(s1, s2, s3);

    cout << "You have created a Scalene with edges of ";
    cout << S.GetSide1() << ", " << S.GetSide2() << ", and " << S.GetSide3() << endl;
    cout << "The Perimeter is " << S.Perimeter() << " and the Area is " << S.Area() << endl;

    return S;
}
