#method 1
n = int(input("enter the number/integer:- "))
count = 0
while n != 0:
    n //= 10
    count += 1
print("Number of digits : ", count)

#method 2
n = int(input("enter the number/integer:- "))
b=str(n)
print(len(b))

#method 3