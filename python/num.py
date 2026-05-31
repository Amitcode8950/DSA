# #output in the python file using print function 
print("hello world")

# # interpeter age value is 25 mean data is store form left to right in memory
age =25
print(age)
# # find the type in pythoon
age =25
print(type(age))
# #puctuators
# #() {} @ [] # -= += /= *= //= ==

# #type of language  1 inplicit -canot give the type of the data    2   explicit - can give the also data type 
# # in case of inplicit  a=10; b="hello" this is error in c language but not in python  
# #comments #  """ """


# #input in python
name = input("enter your name : ")
print("hello ", name)
# #input in python accounding to data type
age =int(input("Enter you age : "))
print("my name is ",name, " my age is ", age)

# # if elif else
age =int(input("enter your age : "))
if(age >=18):
    print("you are eligible for vote")
elif(age < 18 and age >13):
    print("you are not eligible for vote")
else:
    print("you are child")


#ternary operator
food = "cake"
print("yes") if food=="cake" else print("no")

#clever if
age = int(input("enter your age"))
vote = ("yes" ,"no")[age<18]
print(vote)
