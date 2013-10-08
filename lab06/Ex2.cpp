#include <string.h>
#include <iostream>
using namespace std;

class Ex2
{
	public:
		Ex2 ()
		{
			size = 0;
			doublevalues = NULL;
		}
        Ex2 (const Ex2 &other) 
        {
            size = other.size;
            doublevalues = new double[size];
            memcpy(doublevalues, other.doublevalues, sizeof(*other.doublevalues));
        }
		Ex2 (int S, double D) {
			size = S;
			if (size == 0)
				doublevalues = NULL;
			else
			{
				doublevalues = new double [size];
				doublevalues[0] = D;
				for (int i = 1; i < size; i++)
					doublevalues[i] = doublevalues[i-1] * 1.1;
			}
		}
		~Ex2 ()
		{
			delete [] doublevalues;
		}
        Ex2 &operator=(const Ex2 &other)
        {
            delete[] doublevalues;
            size = other.size;
            doublevalues = new double[size];
            memcpy(doublevalues, other.doublevalues, sizeof(*other.doublevalues));
            return *this;
        }
		friend ostream & operator << (ostream & outs, const Ex2 & e)
		{
			outs << "Size: " << e.size;
			outs << "; Doubles:";
			for (int i = 0; i < e.size; i++)
				outs << " " << e.doublevalues[i];
			return outs;
		}
		int size;
		double * doublevalues;
};

int main ()
{
	Ex2 obj1;
	cout << "obj1 = " << obj1 << endl;
	Ex2 obj2 (5, 7.7);
	cout << "obj2 = " << obj2 << endl;
	obj1 = obj2;
	for (int i = 0; i < obj1.size; i++)
		obj1.doublevalues[i] *= 2;
	cout << "obj1 = " << obj1 << endl;
	cout << "obj2 = " << obj2 << endl;
	return 0;
}
