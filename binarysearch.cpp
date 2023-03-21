#include<iostream>
using namespace std;

int BinarySearch(int a[], int l, int r, int key)
{
if(r>=l)
{
int mid=l+(r-l)/2;
if(key==a[mid]){
    cout<<"\n element found at position:"<<mid+1;
    return mid;}
if(key<a[mid]){return BinarySearch(a, l, mid-1, key);} 
else
{
return BinarySearch(a, mid+1, r, key);
}
}
return -1;
}

int main()
{
int a[]={10, 20, 40, 50, 60, 70, 80};
int n=sizeof(a)/sizeof(a[0]); 
int key;
cout<<"enter the element to be searched";
cin>>key;
int result=BinarySearch(a, 0, n-1, key);
if(result==-1)
{
cout<<"\n element is not found";
}
else
{
cout<<"\n element is found";
}
return 0;
}