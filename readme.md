# Program to determine the type of triangle based on sides

# Input three sides
a = float(input("Enter first side: "))
b = float(input("Enter second side: "))
c = float(input("Enter third side: "))

# Check if valid triangle
if a + b > c and a + c > b and b + c > a:
    if a == b and b == c:
        print("This is an Equilateral Triangle.")
    elif a == b or b == c or a == c:
        print("This is an Isosceles Triangle.")
    else:
        print("This is a Scalene Triangle.")
else:
    print("Invalid triangle sides entered.")
