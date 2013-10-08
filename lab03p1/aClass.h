#include <iostream>

using namespace std;

class aClass
{
	public:
		aClass ();
		aClass (int S, float * V);
		aClass (const aClass & A);
		aClass & operator = (const aClass & A);
		~aClass ();

		int GetSize () const;
		void SetSize (int S);

		float & operator [] (int index);
		bool operator < (const aClass & A) const;
		aClass operator + (const aClass & A) const;
		aClass operator * (const aClass & A) const;
		friend ostream & operator << (ostream & outs, const aClass & A);
		friend istream & operator >> (istream & ins, aClass & A);

	private:
		int size;
		float * values;
};
