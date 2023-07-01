// c++ program to show inheritance
#include <iostream>
using namespace std;

class Animal {             // declaring and defining of class Animal

   public:
    void eat() {           // a public member function of class animal
        cout << "I can eat!" << endl;
    }

    void sleep() {         // another public member function of class Animal
        cout << "I can sleep!" << endl;
    }
};

class Dog : public Animal {   //deriving class Do from class Animal publically
 
   public:
    void bark() {   // public member function of class Dog
        cout << "I can bark! Woof woof!!" << endl;
    }
};

int main() {            //main function, program execution starts here
    Dog dog1;       // creating object of class Dog to access member functions
    dog1.eat();     // since Dog derived publically from Animal it can access member function eat()
    dog1.sleep();   // since Dog derived publically from Animal it can access member function sleep()
    dog1.bark();      // calling function bark()

    return 0;
}
