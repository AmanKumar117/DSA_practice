from random import *
def guess_the_number():
    a= randrange(1,1000)
    i=0
    print("I have a number between 1 and 1000, can u guess my number?")
    while True:
        i= int(input("please type your guess: "))
        if(i>a):
            print("too high, try again")
        elif(i<a):
            print("too low, try again")
        elif(i == a):
            print("Excellent! you guessed the number!")
            ans= str(input("would you like to play again(y or n)"))
            if(ans=='y' or ans=='Y'):
                guess_the_number()
            elif(ans=='n'or ans=='N'):
                print("Thank you for playing")
            else:
                print("please enter y or n")
            break
guess_the_number()



    
    

