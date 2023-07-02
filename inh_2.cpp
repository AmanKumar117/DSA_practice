//c++ program to show function overloading
#include <iostream> 
using namespace std;

void test(int i) {        // creating function test with parameter i of integer type
	cout << " The int is " << i << endl;
}
void test(double  f) {    // creating function test with parameter f of double data type
	cout << " The float is " << f << endl;
}
void test(char const *ch) { // creatting function test with parameter ch of character data type 
	cout << " The char* is " << ch << endl;
}
int main() {       // main function, program execution starts here
	test(5);       // it'll call function test with integer data type parameter
	test(5.5);     // it'll call function test with double data type parameter
	test("five");  // it'll call function test with character data type parameter
	return 0;
}
