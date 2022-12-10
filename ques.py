counter = {} 
  
def addToCounter(country): 
    if country in  counter: 
        counter[country] += 1
    else: 
        counter[country] = 1
  
addToCounter('China') 
addToCounter('Japan') 
addToCounter('china') 
  
print(len(counter)) 
print(counter)
    