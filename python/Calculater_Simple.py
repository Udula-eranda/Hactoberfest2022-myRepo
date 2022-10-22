print("Select operation.")
print("1.Addition")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")

# addition of two numbers
def add(a, b):
    return a + b

# subtraction of two numbers
def subtract(a, b):
    return a - b

# multiply two numbers
def multiply(a, b):
    return a * b

#  divides two numbers
def divide(a, b):
    return a / b

while True:
    # get input from the user
    choice = input("Enter choice(1/2/3/4): ")

    # if choice is one of the four options
    if choice in ('1', '2', '3', '4'):
        number_1 = float(input("Enter first number: "))
        number_2 = float(input("Enter second number: "))

        if choice == '1':
            print(number_1, "+", number_2, "=", add(number_1, number_2))

        elif choice == '2':
            print(number_1, "-", number_2, "=", subtract(number_1, number_2))

        elif choice == '3':
            print(number_1, "*", number_2, "=", multiply(number_1, number_2))

        elif choice == '4':
            print(number_1, "/", number_2, "=", divide(number_1, number_2))

        # if user wants another calculation
        next_calculation = input("Let's do next calculation? (yes/no): ")
        if next_calculation == "no":
            break

    else:
        print("Invalid Input")
        print("Enter Valid Input")