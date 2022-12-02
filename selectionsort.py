import sys 
A = [64, 25, 12, 22, 11] 
  
# Traverse through all array elements 
for i in range(len(A)): 
      
    # Find the minimum element in remaining  
    # unsorted array 
    min_idx = i 
    for j in range(i+1, len(A)): 
        if A[min_idx] > A[j]: 
            min_idx = j 
              
    # Swap the found minimum element with  
    # the first element         
    A[i], A[min_idx] = A[min_idx], A[i] 
  
# Driver code to test above 
print ("Sorted array") 
for i in range(len(A)): 
    print("%d" %A[i])

a = [16, 19, 11, 15, 10, 12, 14]
i = 0
while i<len(a): 
    smallest = min(a[i:])
    index_of_smallest = a.index(smallest) 
    a[i],a[index_of_smallest] = a[index_of_smallest],a[i] 
    i=i+1
print (a)    #if print statement is in while loop it'll show the step by step procedure of sorting