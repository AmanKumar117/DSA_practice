// C++ program for insertion sort
#include <bits/stdc++.h>
using namespace std;
 
void insertionSort(int a[], int n)
{
    int i, m, j;
    for (i = 1; i < n; i++)
    {
        m = a[i];
        j = i - 1;
 
        while (j >= 0 && a[j] > m)
        {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = m;
    }
}
 
void printArray(int a[], int n)
{
    int i;
    for (i = 0; i < n; i++)
        cout << a[i] << " ";
    cout << endl;
}
 
int main()
{
    int a[] = { 12, 11, 13, 5, 6 };
    int n = sizeof(a) / sizeof(a[0]);
    insertionSort(a, n);
    printArray(a, n);
 
    return 0;
}