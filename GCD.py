num1 = int(input("enter first number: "))    # taking inputs from the user
num2 = int(input("enter second number: "))
if num1 > num2:      # to find the smaller number
    smaller = num2   
else:
    smaller = num1
for i in range(1, smaller+1):    # loop to find the common divisor, loop in range from 1 to smaller number
    if((num1 % i == 0) and (num2 % i == 0)):   # condition for divisibility, if both divisible then it is common divisor
        GCD = i                  # GCD stores the current value of 'i'
print("The G.C.D is", GCD)  # printing output