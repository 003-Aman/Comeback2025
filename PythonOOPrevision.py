#CREATING A CLASS
class MyClass:
    section ="B" #what this does is that this is true for every object that will be created out of this class. its an attribute
#CREATING AN OBJECT WITH THE SAME CLASS
s1= MyClass()
print(s1.section)# were asking for the attribute


#THE __init__() method , which is the constructor. in my own words, this is a function that tells the objects what attribute it has or how to behave when it is created
class Cars:
    def __init__(self,make,model,year):
        self.country = "USA"# this can be set as default attribute for every object created. dont have to take it in as a parameter
        self.make = make
        self.model = model
        self.year = year

    def drive(self):
        print("VROOM VROOM "+self.model+" is driving!")

car1= Cars("Hyundai","Elantra",2020)
print(car1.make)
print(car1.model)
print(car1.year)
print(car1.country)
car1.drive()
        

class Gadget:
    def __init__(object,type, year, make):#self doesnt have to be named self it can be anything like object here
        object.country ="MADE IN USA"
        object.type =type
        object.year = year
        object.make = make
    def display_info(abc):#this is very interesting , so it can change the name as well in every function for self it works the same . 
        print("The gadget is : "+abc.type+", the year is : "+str(abc.year)+", the make is : "+abc.make)

g1=Gadget("Mobile","2025","Apple")
g1.display_info()
print(g1.country)

#CALLING METHODS WITH SELF
class Soccer:
    def __init__(self,name,position):
        self.name =name
        self.position =position

    def target(self):
        return "Score a goal!! "
    
    def outcome(self):
        message = self.target()
        print(message +"And win 3 points")

p1=Soccer("Messi","Striker")
p1.outcome()