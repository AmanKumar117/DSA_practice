#include <iostream>

using namespace std;

void bubbleSort(int arr[], int size) {
  int flag=0, i, j;
  for ( j = 0; j < size - 1; ++j) {
    for ( i = 0; i < size - j - 1; ++i) {

      if (arr[i] > arr[i + 1]) {

        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        flag=1;
      }
    }
    if(flag=0){break;}
  }
  cout<<"\n sorted array: ";
  for(i=0; i<size; i++)
  { cout<< arr[i]<<" ";}
}

int main()
{   int i;
    int arr[] = {-2, 45, 0, 11, -9};
    int size = sizeof(arr) / sizeof(arr[0]);
    cout<<"before sorting:";
    for(i=0; i<size; i++)
    { cout<< arr[i]<<" ";}
    bubbleSort(arr, size);
    return 0;
}