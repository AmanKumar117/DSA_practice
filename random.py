import random  # importing random function from the liberary

l= int(input("enter lower limit of interval: "))    # taking a range from user from which a random number would be found
u= int(input("enter upper limit of interval: "))
print(random.randrange(l,u))                        # prints a random number in the given interval
