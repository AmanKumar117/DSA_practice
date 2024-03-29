#include<iostream>
using namespace std;

void swap(int* a, int* b)
{
	int t = *a;
	*a = *b;
	*b = t;
}

int partition (int arr[], int low, int high)
{
	int pivot = arr[high]; 
	int i = (low - 1);

	for (int j = low; j <= high- 1; j++)
	{
		
		if (arr[j] <= pivot)
		{
			i++; 
			swap(&arr[i], &arr[j]);
		}
	}
	swap(&arr[i + 1], &arr[high]);
	return (i + 1);
}

void quickSort(int arr[], int low, int high)
{
	if (low < high)
	{
		
		int pivot = partition(arr, low, high);
		quickSort(arr, low, pivot - 1);
		quickSort(arr, pivot + 1, high);
	}
}

void display(int arr[], int size)
{
	int i;
	for (i=0; i < size; i++)
    cout<< arr[i]<<" ";
}

int main()
{
	int arr[] = {3,8,6,2,7,1,5};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout<<"\n array before sorting: ";
    display(arr,n);
	quickSort(arr, 0, n-1);
	cout<<"\n Sorted array: ";
	display(arr, n);
	return 0;
}
