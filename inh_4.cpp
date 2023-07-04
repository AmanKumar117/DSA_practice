// Function Overriding 
#include <iostream>
using namespace std;
class Mammal {       // creating class Mammal

public:
	void eat() {       // member function eat()

		cout << "Mammals eat...";
	}

};

class Cow: public Mammal {    // class Cow derived from class Mammal publically

public:
	void eat() {    // member function eat(),  overriding the previous function

		cout << "Cows eat grass...";
	}
};
int main(void) {   //main function , program execution starts here

	Cow c = Cow();  //   creating objet

	c.eat(); //calling member function eat() of class Cow

	return 0;

}
