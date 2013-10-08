#define DEBUG false

#include "aClass.h"

void debug(string enter_exit, string function, const aClass *address)
{
    if (!DEBUG)
        return;

    static int indent = 0;

    if (enter_exit == "exit") --indent;

    for (int i = 0; i < indent; ++i)
        cout << "-->";
    cout << function << " " << enter_exit << "ed for " << address << endl;
    if (enter_exit == "enter") ++indent;
}

aClass::aClass ()
{
    debug("enter", "Default Constructor", this);
	size = 0;
	values = NULL;
    debug("exit", "Default Constructor", this);
}

aClass::aClass (int S, float * V)
{
    debug("enter", "Overloaded Constructor", this);
	size = S;
	values = new float[S];
    for (int i = 0; i < S; ++i)
        values[i] = V[i];
    debug("exit", "Overloaded Constructor", this);
}

aClass::aClass (const aClass & A)
{
    debug("enter", "Copy Constructor", this);
	size = A.size;
    values = new float[size];
    for (int i = 0; i < size; ++i)
        values[i] = A.values[i];
    debug("exit", "Copy Constructor", this);
}

aClass & aClass::operator = (const aClass & A)
{
    debug("enter", "Assignment Operator", this);
	size = A.size;
    values = new float[size];
    for (int i = 0; i < size; ++i)
        values[i] = A.values[i];
    debug("exit", "Assignment Operator", this);
	return * this;
}

aClass::~aClass ()
{
    debug("enter", "Deconstructor", this);
	delete [] values;
    debug("exit", "Deconstructor", this);
}

int aClass::GetSize () const
{
    debug("enter", "GetSize", this);
    debug("exit", "GetSize", this);
	return size;
}

void aClass::SetSize (int S)
{
    debug("enter", "SetSize", this);
    if (size < S)
	{
        float *temp = new float[S];
        for (int i = 0; i < size; ++i)
            temp[i] = values[i];
        for (int i = size; i < S; ++i)
            temp[i] = 0.0;
        delete[] values;
        values = temp;
        size = S;
    }

    else if (size > S)
    {
        float *temp = new float[S];
        for (int i = 0; i < size; ++i)
            temp[i] = values[i];
        delete[] values;
        values = temp;
        size = S;
    }
    debug("exit", "SetSize", this);
}

float & aClass::operator [] (int index)
{
    debug("enter", "Index Operator", this);
    debug("exit", "Index Operator", this);
    return values[index];
}

bool aClass::operator < (const aClass & A) const
{
    debug("enter", "LessThan Operator", this);
	if (size != A.size)
    {
        debug("exit", "LessThan Operator", this);
    	return size < A.size;
	}
    for (int i = 0; i < size; i++)
		if (values[i] < A.values[i])
        {
            debug("exit", "LessThan Operator", this);
			return true;
        }
    debug("exit", "LessThan Operator", this);
	return false;
}

aClass aClass::operator + (const aClass & A) const
{
    debug("enter", "Addition Operator", this);
	aClass sum;
	sum.size = size + A.size;

    sum.values = new float[sum.size];
    for (int i = 0; i < size; ++i)
        sum.values[i] = values[i];

    for (int i = 0; i < A.size; ++i)
        sum.values[size + i] = A.values[i];

    debug("exit", "Addistion Operator", this);
	return sum;
}

aClass aClass::operator * (const aClass &A) const
{
    debug("enter", "Multiplication Operator", this);
	aClass product;
	product.size = size * A.size;
	product.values = new float[product.size];

    for (int i = 0; i < size; ++i)
        for (int j = 0; j < A.size; ++j)
            product.values[i * A.size + j] = values[i] * A.values[j];
    
    debug("exit", "Multiplication Operator", this);
	return product;
}

ostream & operator << (ostream & outs, const aClass & A)
{
    debug("enter", "Output Operator", &A);
	outs << A.size << ": [";
	if (A.size > 0)
		outs << A.values[0];
	for (int i = 1; i < A.size; i++)
		outs << ", " << A.values[i];
	outs << "]";
    debug("exit", "Output Operator", &A);
    return outs;
}

istream & operator >> (istream & ins, aClass & A)
{
    debug("enter", "Input Operator", &A);
	int S = 0;
	float * V = NULL;
	ins >> S;
    
	if (ins.fail())
    {
        debug("exit", "Input Operator", &A);
		return ins;
    }

	if (S > 0)
	{
		V = new float [S];
		for (int i = 0; i < S; i++)
			ins >> V[i];
	}

	if (ins.fail())
	{
        debug("exit", "Input Operator", &A);
        return ins;
    }
    
	A = aClass (S, V);	
	
    debug("exit", "Input Operator", &A);
    return ins;
}

