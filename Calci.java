import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        }
        else if (choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        }
        else if (choice == 3) {
            System.out.println("Result: " + (num1 * num2));
        }
        else if (choice == 4) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

