#include<iostream>

using namespace std;

// creating class student
class student   
{
    private:
    float mark1, mark2, mark3;
    float avg;
    public:
    student()            // constructor initialized
    {
        cout<<"enter mark of 1st subject:"<<endl;
        cin>>mark1;
        cout<<"enter mark of 2nd subject:"<<endl;
        cin>>mark2;
        cout<<"enter mark of 3rd subject:"<<endl;
        cin>>mark3;
    }
    int avg_marks()    // function to calculate average of marks 
    {
        avg= (mark1+mark2+mark3)/3;
        cout<<"average of marks is:"<<avg<<endl;
    }
    ~student()
    {
        cout<<"deconstructor was called"<<endl;
    }
};
int main()   // main function start here
{
    student obj1; // creating object of class student
    obj1.avg_marks(); // calling function avg_marks() using object of class student
}