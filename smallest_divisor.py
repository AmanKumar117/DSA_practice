n= int(input("Enter a number : "))            # taking a number from the user 

for i in range(2, n+1):          # checking for divisor in range 2 to given number
    if n % i == 0:               # condition for divisibility 
        print ("The smallest divisor for given number is ", i)   # printing output
        break                    # break will terminate the conditions, so that only the smallest divisor is found
