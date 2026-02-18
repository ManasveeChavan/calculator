import sys

if len(sys.argv) != 4:
    print("Usage: python calci.py <choice> <num1> <num2>")
    sys.exit()

choice = sys.argv[1]
num1 = float(sys.argv[2])
num2 = float(sys.argv[3])

print("Simple Calculator")

if choice == '1':
    print("Result:", num1 + num2)
elif choice == '2':
    print("Result:", num1 - num2)
elif choice == '3':
    print("Result:", num1 * num2)
elif choice == '4':
    if num2 != 0:
        print("Result:", num1 / num2)
    else:
        print("Error: Cannot divide by zero")
else:
    print("Invalid choice")
print("this is print statemtn")
