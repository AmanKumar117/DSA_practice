#include <iostream>
using namespace std;

class node {
    public:
   int data;
   node *next;
};

node *head = NULL;
node *current = NULL;
void insert(int data) {
   node *link = new node();
   link->data = data;
   link->next = NULL;
   if(head==NULL) {
      head = link;
      head->next = link;
      return;
   }
   current = head;
   while(current->next != head)
      current = current->next;
   current->next = link;
   link->next = head;

}

void find_data(int item) {
   int pos = 0;

   if(head == NULL) {
      printf("Linked List not initialized");
      return;
   } 

   current = head;

   while(current->next != head) {
      if(current->data == item) {
         cout<<item<<" found at position"<< pos;
         return;
      }

      current = current->next;
      pos++;
   }

   if(current->data == item) {
      cout<<item<<" found at position "<<pos;
      return;
   }

   cout<<"\n does not exist in the list"<<item;
}

int main() {
   insert(10);
   insert(30);
   insert(40);
   insert(56); 
   find_data(56);
   return 0;
}