// Operator Overloading
#include<iostream> 
using namespace std;

class ComplexNum {      // creating class ComplecNum
private:
	int real, over;
public:
	ComplexNum(int rl = 0, int ov = 0) {  // parameterised constructor
		real = rl;   
		over = ov; 
	}

	ComplexNum operator + (ComplexNum const &obj) {  // copy constructor with '+' operator overloaded
		ComplexNum result;
		result.real = real + obj.real;
		result.over = over + obj.over;
		return result;
	}
	void print() {      //a member function
		cout << real << " + i" << over << endl; 
	}
};
int main()      //main function, program execution starts here
{
	ComplexNum c1(10, 2), c2(3, 7);  //parameterised constructor called
	ComplexNum c3 = c1+c2;  // copy constructor called
	c3.print();
}
