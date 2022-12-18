#to check for prime numbers in an interval
l= int(input("enter the lower limit of range: "))  # taking input of the range of interval
u= int(input("enter the upper limit of range: "))

print("Prime numbers between", l, "and", u, "are:")

for num in range(l, u+1):   # loop to find prime number in the given range    
   
   if num > 1:     # all prime numbers are greater than 1
       for i in range(2, num):  # loop to check if the number is divisible by any other number other than 1 or itself
           if (num % i) == 0:   # if divisible , then not prime number
               break
       else:                    # else is a prime number
           print(num)           # printing the numbers