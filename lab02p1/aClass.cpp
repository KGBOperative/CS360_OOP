#include "aClass.h"

aClass::aClass ()
{
	size = 0;
	values = NULL;
}

aClass::aClass (int S, float * V)
{
	size = S;
	values = new float[S];
    for (int i = 0; i < S; ++i)
        values[i] = V[i];
}

aClass::aClass (const aClass & A)
{
	size = A.size;
    values = new float[size];
    for (int i = 0; i < size; ++i)
        values[i] = A.values[i];
}

aClass & aClass::operator = (const aClass & A)
{
	size = A.size;
    values = new float[size];
    for (int i = 0; i < size; ++i)
        values[i] = A.values[i];
	return * this;
}

aClass::~aClass ()
{
	delete [] values;
}

int aClass::GetSize () const
{
	return size;
}

void aClass::SetSize (int S)
{
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
}

float & aClass::operator [] (int index)
{
    return values[index];
}

bool aClass::operator < (const aClass & A) const
{
	if (size != A.size)
		return size < A.size;
	for (int i = 0; i < size; i++)
		if (values[i] < A.values[i])
			return true;
	return false;
}

aClass aClass::operator + (const aClass & A) const
{
	aClass sum;
	sum.size = size + A.size;

    sum.values = new float[sum.size];
    for (int i = 0; i < size; ++i)
        sum.values[i] = values[i];

    for (int i = 0; i < A.size; ++i)
        sum.values[size + i] = A.values[i];

	return sum;
}

aClass aClass::operator * (const aClass &A) const
{
	aClass product;
	product.size = size * A.size;
	product.values = new float[product.size];

    for (int i = 0; i < size; ++i)
        for (int j = 0; j < A.size; ++j)
            product.values[i * A.size + j] = values[i] * A.values[j];
    
	return product;
}

ostream & operator << (ostream & outs, const aClass & A)
{
	outs << A.size << ": [";
	if (A.size > 0)
		outs << A.values[0];
	for (int i = 1; i < A.size; i++)
		outs << ", " << A.values[i];
	outs << "]";
}

istream & operator >> (istream & ins, aClass & A)
{
	int S = 0;
	float * V = NULL;
	ins >> S;
	if (ins.fail())
		return ins;
	if (S > 0)
	{
		V = new float [S];
		for (int i = 0; i < S; i++)
			ins >> V[i];
	}
	if (ins.fail())
		return ins;
	A = aClass (S, V);	
	return ins;
}

