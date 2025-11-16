print("New Beginning")
print("Hello");print("Aman");print("Shrestha")
#THIS IS HOW YOU COMMENT IN PYTHON


#VARIABLES
x = 5               
y="Hello, World"
print(3+3)
myVariableName = "Aman Shrestha" #camel case
_my_variable_name = "Aman Shrestha" #snake case
MyVariableName = "Aman Shrestha" #pascal case

#MULTIPLE VARIABLES
a, b, c = "Orange", "Banana", "Cherry"

#UNPACK A COLLECTION
fruits = ["Apple", "Banana", "Cherry"]
x, y, z = fruits
print(x)
print(y)
print(z)
x ="Python"
y=" is "
z="awesome"
print(x, y, z)

#GLOBAL VARIABLES
name = "Aman"

def myFunction():
    name ="Piyush"
    print("My name is "+name)
myFunction()
print("My name is "+name)

#global keyword
x='Awesome'
def myfunc():
    global x
    x= "fantastic"
myfunc()

print("Python is "+x)

#Random number
import random 
print(random.randrange(1, 10))

#TYPE CASTING
x = int ("3")
y = str(3)


#LOOPING THROUGH A STRING
for  x in "Aman":
    print(x, end ="")
print()
country ="Aman"
for x in country:
    print(x)

#REMOVE WHITESPACE
a ="hello"
print(a.strip())
print(a.split())