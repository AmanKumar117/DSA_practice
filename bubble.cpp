#include <iostream>

using namespace std;

void swap(int *a, int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
void BubbleSort(int a[], int n)
{
    int i, j, flag=0;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1]) {swap(&a[j], &a[j+1]); flag=1;}
        }
    if(flag==0){break;}
    }
}
int main()
{
    int a[]={5, 8, 9, 1, 4};
    int n=sizeof(a)/sizeof(a[0]);
    for(int i=0;i<n;i++)
    {
        cout<<"\n element of array is"<<a[i];
    }
    BubbleSort(a, n);
    for(int i=0;i<n;i++)
    {
        cout<<"\n element of array is"<<a[i];
    }
    cout<<"\nHello World";

    return 0;
}