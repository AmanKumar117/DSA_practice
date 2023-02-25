slot = ['A1', 'B1', 'C1']
#appending
slot.append('D1')
print("after appending slot: ",slot)

#copying an array
a= slot.copy()
print("copy of slot in a= ",a)

#counting the number of times an element appeared in array
print("numbers of time A1 appeared=", slot.count('A1'))

#clearing an array or deletion of every element from array
slot.clear()
print("cleared slot= ",slot)

#adding items from one array to another
slot1 = ['E1','E2','F1']
a.extend(slot1)
print("extended a= ",a)

#insertion
slot1.insert(0,'D2')
print("after insertion in slot1: ",slot1)

#poping of element, poping is done by giving index value
print("poped element of slot1: ",slot1.pop(2))
print("after poping, slot1: ", slot1)

#deletion of element of array, it is done by mentioning the element
slot1.remove('F1')
print("after removin, slot1: ",slot1)

#reversing the elements of array
print("before reversing array= ", a)
a.reverse()
print("after reversing array= ", a)