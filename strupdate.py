import string
str= input("enter the string: ")
str1=""
num= int(input("enter the number to be added: "))
for i in range(len(str)):
    str1+= chr(ord(str[i]) + num)
print(str1)