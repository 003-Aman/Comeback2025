#CREATING A CLASS
class MyClass:
    section ="B" #what this does is that this is true for every object that will be created out of this class. its an attribute
#CREATING AN OBJECT WITH THE SAME CLASS
s1= MyClass()
print(s1.section)# were asking for the attribute


#THE __init__() method , which is the constructor. in my own words, this is a function that tells the objects what attribute it has or how to behave when it is created
class Cars:
    def __init__(self,make,model,year):
        self.make = make
        self.model = model
        self.year = year

car1= Cars("Hyundai","Elantra",2020)
print(car1.make)
print(car1.model)
print(car1.year)
        