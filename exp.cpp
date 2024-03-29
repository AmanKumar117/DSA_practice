#include<iostream>
#include<algorithm>
using namespace std;
  
// A structure to represent a job
struct Job
{
   char id;     // Job Id
   int dead;    // Deadline of job
   int profit;  // Profit if job is over before or on deadline
};
  //fun()
// This function is used for sorting all jobs according to profit
bool comparison(Job a, Job b)
{
     return (a.profit > b.profit);
}
  
// Returns minimum number of platforms required
void printJobScheduling(Job arr[], int n)
{
    // Sort all jobs according to decreasing order of profit
    sort(arr, arr+n, comparison);
  
    int result[n]; // To store result (Sequence of jobs)
    bool slot[n];  // To keep track of free time slots
  
    // Initialize all slots to be free
    for (int i=0; i<n; i++)
        slot[i] = false;
  
    // Iterate through all given jobs
    for (int i=0; i<n; i++)
    {
       // Find a free slot for this job (Note that we start
       // from the last possible slot)
       for (int j=min(n, arr[i].dead)-1; j>=0; j--)
       {
          // Free slot found
          if (slot[j]==false)
          {
             result[j] = i;  // Add this job to result
             slot[j] = true; // Make this slot occupied
             break;
          }
       }
    }
  
    // Print the result
    for (int i=0; i<n; i++)
       if (slot[i])
         cout << arr[result[i]].id << " ";
}
  
// Driver code
int main()
{
    Job arr[] = { {'a', 9, 15}, {'b', 2, 2}, {'c', 5, 18},
                   {'d', 7, 1}, {'e', 4, 25},{'f', 2, 20},{'g', 5, 8},{'h', 7, 10},{'i', 4, 12},{'j', 3, 5}};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << "Following is maximum profit sequence of jobs \n";
    
    // Function call
    printJobScheduling(arr, n);
    return 0;
}