#include <iostream>
using namespace std;
class Node {
    public:
    int data;
    Node *prev;
    Node *next;
};
 Node* head = NULL;
void insert(int newdata) {
   Node* newnode = new Node();
   newnode->data = newdata;
   newnode->prev = NULL;
   newnode->next = head;
   if(head != NULL)
   head->prev = newnode ;
   head = newnode;
}
void display() {
   Node* ptr;
   ptr = head;
   while(ptr != NULL) {
      cout<< ptr->data <<" ";
      ptr = ptr->next;
   }
}
int main() {
   insert(1);
   insert(10);
   insert(20);
   insert(25);
   insert(30);
   cout<<"The doubly linked list is: ";
   display();
   return 0;
}