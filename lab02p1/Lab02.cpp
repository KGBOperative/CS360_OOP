#include <iostream>
#include <fstream>
#include <cstdlib>
#include <vector>
#include <algorithm>

#include "aClass.h"

using namespace std;

int main (int argc, char * argv [])
{
	if (argc < 2)
	{
		cerr << "Input file name required. Usage: ";
		cerr << argv[0] << " <filename>\n";
		exit (1);
	}

	ifstream input (argv[1]);
	if (input.fail ())
	{
		cerr << "File: " << argv[1] << " cannot be opened.\n";
		exit (2);
	}	

	vector <aClass> objects;

	// declare an object of type aClass using the default constructor 
	// and add it to the end of the vector (call the object "first")
	aClass first;
    objects.push_back(first);

	// read data into "first" and add it to the end of the vector
    input >> first;
    objects.push_back(first);

	// declare an object of type aClass using the copy constructor 
	// and add it to the end of the vector (call the object "second")
    aClass second(first);
    objects.push_back(second);

	// read data into "second" and add it to the end of the vector
    input >> second;
    objects.push_back(second);

	// declare an object of type aClass using the overloaded constructor
	// and add it to the end of the vector (call the object "third" and
	// put the values 1.1, 2.2, 3.3, and 4.4 in the object)
    float temp[] = {1.1, 2.2, 3.3, 4.4};
    aClass third(4, temp);
    objects.push_back(third);
    delete[] temp;

	// declare an object of type aClass called "fourth"
    aClass fourth;

	// set "fourth" to the sum of "first" and "second" and add "fourth"
	// to the end of the vector
    fourth = first + second;
    objects.push_back(fourth);

	// set "fourth" to the product of "second" and "third" and add "fourth"
	// to the end of the vector
    fourth = second * third;
    objects.push_back(fourth);
	
	// using the [] operator, reverse the float values in "first" and 
	// add "first" to the end of the vector
    int size = first.GetSize();
    for (int i = 0; i < size/2; ++i)
    {
        float temp = first[i];
        first[i] = first[size - 1 - i];
        first[size - 1 - i] = temp;
    }
    objects.push_back(first);
	
	// increase the size of "second" by one and set the last float value
	// in "second" to the sum of the previous values and add "second"
	// to the end of the vector
    size = second.GetSize();
    float sum = 0.0;
    for (int i = 0; i < size; ++i)
        sum += second[i];
    second.SetSize(size + 1);
    second[size] = sum;
    objects.push_back(second);

	// decrease the size of "third" by one add "third" to the end of
	// the vector
    third.SetSize(third.GetSize() - 1);
    objects.push_back(third);

	// write the vector of objects
	cout << "Unsorted list:\n";
	for (int i = 0; i < objects.size(); i++)
		cout << objects[i] << endl;

	// sort the vector of objects
    sort(objects.begin(), objects.end());

	// write the vector of objects
	cout << "\nSorted list:\n";
	for (int i = 0; i < objects.size(); ++i)
        cout << objects[i] << endl;
	return 0;
}
