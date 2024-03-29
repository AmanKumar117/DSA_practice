
#include <iostream>
using namespace std;

#define n 100

class Stack {
	int top;
public:
	int a[n]; 
	Stack() { top = -1; }
	void push(int x);
	int pop();
	int peek();
	bool isEmpty();
};
void Stack::push(int x)
{
	if (top >= (n - 1)) {
		cout << "Stack Overflow";
	}
	else {
		a[++top] = x;
		cout << x << " pushed into stack\n";
	}
}
int Stack::pop()
{
	if (top < 0) {
		cout << "Stack Underflow";
		return 0;
	}
	else {
		int x = a[top--];
		return x;
	}
}
int Stack::peek()
{
	if (top < 0) {
		cout << "Stack is Empty";
		return 0;
	}
	else {
		int x = a[top];
		return x;
	}
}
bool Stack::isEmpty()
{
	return (top < 0);
}

int main()
{
	class Stack s;
	s.push(10);
	s.push(20);
	s.push(30);
	cout << s.pop() << " Popped from stack\n";
	cout<<"Elements present in stack : ";
	while(!s.isEmpty())
	{
		cout<<s.peek()<<" ";
		s.pop();
	}
	return 0;
}
