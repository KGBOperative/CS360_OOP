#include <iostream>
#include <fstream>
#include <cstdlib>
#include <vector>
#include <algorithm>

#include "aClass.h"

using namespace std;

int main (int argc, char * argv [])
{
    cout << "aClass A;\n";
    aClass A;

    cout << "\naClass B(2, {5.5, 6.6});\n";
    float values[] = {5.5, 6.6};
    aClass B(2, values);

    cout << "\naClass C = B;\n";
    aClass C = B;

    cout << "\nA = C;\n";
    A = C;

    cout << "\ncin >> C;\n";
    cin >> C;

    cout << "\nvector<aClass> V;\nV.push_back(C);\n";
    vector<aClass> V;
    V.push_back(C);

    cout << "\naClass D = A + C;\n";
    aClass D = A + C;

    cout << "\naClass E = A * C;\n";
    aClass E = A * C;

    cout << "\nD[3] = 4.4;\n";
    D[3] = 4.4;

    cout << "\nfloat total = 0;\nfor (int i = 0; i < D.GetSize(); ++i)\n\ttotal += D[i];\ncout << \"Total = \" << total << endl;\n";
    float total = 0;
    for (int i = 0; i < D.GetSize(); ++i)
        total += D[i];
    cout << "Total = " << total << endl;

    cout << "\nA.SetSize(5);\n";
    A.SetSize(5);

    cout << "\ncout << \"A = \" << A << endl;\n";
    cout << "A = " << A << endl;

    cout << "\ncout << \"B = \" << B << endl;\n";
    cout << "B = " << B << endl;

    cout << "\ncout << \"C = \" << C << endl;\n";
    cout << "C = " << C << endl;

    cout << "\ncout << \"D = \" << D << endl;\n";
    cout << "D = " << D << endl;

    cout << "\ncout << \"E = \" << E << endl;\n";
    cout << "E = " << E << endl;

	return 0;
}
