n= int(input("Enter an integer:"))  # taking input from the user
print(" Prime Factors are:")
i=1
while(i<=n):# loop is used   
    k=0
    if(n%i==0): #the factors of the integer are computed by using the modulus operator 
        j=1     # and checking if the remainder of the number divided by i is 0. 
        while(j<=i):      #Then the factors of the integer are then again checked if the factor is prime or not.
            if(i%j==0):
                k=k+1
            j=j+1
        if(k==2):         #If the factor of the integer has two factors, the factor is prime.
            print(i)      #The prime factor of the integer is printed.
    i=i+1