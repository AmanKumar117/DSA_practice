/* Program for Unary Operator Overloading used as both Prefix & Postfix*/ 

#include<iostream>
using namespace std;

class count
{
private:
    int value;
public:
  				  // Constructor to initialize count to 5
    count()
    {
        value = 5;
    }
   				 // Overload ++ when used as prefix
    void operator ++()
    {
        ++value;
    }
   				 // Overload ++ when used as postfix
    void operator ++(int)
    {
        ++value;
    }

    void display() {
        cout << "Count: " << value << endl;
    }
};

int main()
{
    count count1;

    				// Call the "void operator ++ (int)" function
    count1++;
    count1.display();

   				 // Call the "void operator ++ ()" function
    ++count1;
    count1.display();
    return 0;
}