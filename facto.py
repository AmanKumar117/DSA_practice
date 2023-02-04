num= int(input("Enter a number: "))
fac = 1
if num < 0:
   print("factorial does not exist for negative numbers")
elif num == 0:
   print("factorial= 1")
else:
   for i in range(1,num + 1):
       fac= fac*i
   print("The factorial of",num,"is",fac)
