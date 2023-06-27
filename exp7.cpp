#include<iostream>

using namespace std;

// creating class volume
class volume          
{
    private:
    float l, b, h;
    public:
    volume()            // constructor initialized
    {
        cout<<"enter length of the room:"<<endl;
        cin>>l;
        cout<<"enter width of the room:"<<endl;
        cin>>b;
        cout<<"enter height of the room:"<<endl;
        cin>>h;
    }
    int vol()    // function to calculate volume of room 
    {
         cout<<"volume of the room is:"<<l*b*h<<endl;
    }
    ~volume()
    {
        cout<<"deconstructor was called"<<endl;
    }
};
int main()   // main function start here
{
    volume obj1; // creating object of class volume
    obj1.vol(); // calling function vol() using object of class volume 
}