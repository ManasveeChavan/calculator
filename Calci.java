public class Calci {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Calci <choice> <num1> <num2>");
            return;
        }

        int choice = Integer.parseInt(args[0]);
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        System.out.println("Simple Calculator");

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
                System.out.println("Error! Division by zero not allowed.");
            }
        }
        else {
            System.out.println("Invalid choice!");
        }
    }
}
