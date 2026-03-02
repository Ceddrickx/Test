import java.util.Scanner;

public class ArithmeticOperation {
    // Create a single scanner object to take inputs
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Create an instance of ArithmeticOperation to call non-static methods
        ArithmeticOperation ao = new ArithmeticOperation();

        // Call methods for different operations
        ao.add();
        ao.subtract();
        ao.multiply();
    }

    // Method for addition
    private void add() {
        System.out.print("Enter the first number for addition: ");
        int num1 = input.nextInt(); // Read the first number

        System.out.print("Enter the second number for addition: ");
        int num2 = input.nextInt(); // Read the second number

        int result = num1 + num2; // Perform addition

        System.out.println("Addition result: " + result); // Output the result
    }

    // Method for subtraction
    public void subtract() {
        System.out.print("Enter the first number for subtraction: ");
        int num1 = input.nextInt(); // Read the first number

        System.out.print("Enter the second number for subtraction: ");
        int num2 = input.nextInt(); // Read the second number

        int result = num1 - num2; // Perform subtraction

        System.out.println("Subtraction result: " + result); // Output the result
    }

    // Method for multiplication
    public void multiply() {
        System.out.print("Enter the first number for multiplication: ");
        double num1 = input.nextDouble(); // Read the first number (use double for decimals)

        System.out.print("Enter the second number for multiplication: ");
        double num2 = input.nextDouble(); // Read the second number

        double result = num1 * num2; // Perform multiplication

        System.out.println("Multiplication result: " + result); // Output the result
    }
}