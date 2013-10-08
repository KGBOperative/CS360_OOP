#include <iostream>
using namespace std;

class Ex3
{
	public:
		Ex3 ()
		{
			size = 0;
			doublevalues = NULL;
		}
		Ex3 (const Ex3 & that)
		{
			this->size = that.size;
			this->doublevalues = new double [this->size];
			for (int i = 0; i < this->size; i++)
			{
				this->doublevalues[i] = that.doublevalues[i];
			}
		}
		Ex3 & operator = (const Ex3 & that)
		{
			if (this == &that)
				return * this;
			delete [] this->doublevalues;
			this->size = that.size;
			this->doublevalues = new double [this->size];
			for (int i = 0; i < this->size; i++)
			{
				this->doublevalues[i] = that.doublevalues[i];
			}
			return * this;
		}
		Ex3 (int S, double D) {
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
		~Ex3 ()
		{
			delete [] doublevalues;
		}
		friend ostream & operator << (ostream & outs, const Ex3 & e)
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
	Ex3 obj1;
	cout << "obj1 = " << obj1 << endl;
	Ex3 obj2 (5, 7.7);
	cout << "obj2 = " << obj2 << endl;
	Ex3 obj3 = obj2;
	cout << "obj3 = " << obj3 << endl;
	obj1 = obj2;
	for (int i = 0; i < obj1.size; i++)
		obj1.doublevalues[i] *= 2;
	cout << "obj1 = " << obj1 << endl;
	cout << "obj2 = " << obj2 << endl;
	return 0;
}
