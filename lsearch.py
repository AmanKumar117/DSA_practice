arr = [10,20,30,40,50,60,70,80,90,100]
x = int(input("enter the item from list arr which is to be searched:-"))
for i in range(len(arr)):
    if arr[i] == x:
        break

print("element found at index ", i)

list1 = [4,1,2,5,3]
search = int(input("Enter search number:")) 
found=False
for i in range(0,len(list1)):
    if search==list1[i]:
        print("number ",str(search)+"found at position " + str(i)) 
        found=True
if found==False:
     print("number ",str(search)+" is not found ")