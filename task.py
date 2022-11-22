#finding largest number in a list
lis= [1,5,76,45,3]
max= lis[0]
#searching in list for largest number
for i in range(0,5):
    if lis[i]>max :
        max= lis[i]

print(max)

#2nd method
lis.sort()
print("largest number= ", lis[-1])

