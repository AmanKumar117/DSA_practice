n= int(input("number of terms =  "))  # to ask the user upto which term he want the series

n1, n2 = 0, 1     # first two terms
count = 0         # initializing count = 0 
if n <= 0:        # if by mistake user enters a negative value in number of terms
   print("Please enter a positive integer")
elif n == 1:      # if number of terms is 1
   print("Fibonacci series upto",n,":")
   print(n1)
else:
   print("Fibonacci series:")
   while count < n:           # loop to print fibonacci series of n terms
       print(n1) # to print the terms
       nth = n1 + n2         # temporary variable stores the sum
       n1 = n2               # changing the values of variables for next iteration in loop
       n2 = nth
       count += 1