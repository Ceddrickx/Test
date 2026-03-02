import java.util.Scanner;

public class ArithemticOperationTwo {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArithemticOperationTwo ao = new ArithemticOperationTwo();
        System.out.print("\nHello");
        System.out.println("\nHello");
        ao.add();
        ao.subtract();
        ao.multiply();
    }

    private void add() {
        int Addition1, Additon2, result;
        System.out.print("Addition1: ");
        Addition1 = input.nextInt();
        System.out.print("Addition2: ");
        Additon2 = input.nextInt();
        result = Addition1 + Additon2;
        System.out.println("Addition Result: " + result);
    }

    public void subtract() {
        int Subtraction1, Subtraction2, result;
        System.out.print("Subtraction1: ");
        Subtraction1 = input.nextInt();
        System.out.print("Subtraction2: ");
        Subtraction2 = input.nextInt();
        result = Subtraction1 - Subtraction2;
        System.out.println("Substraction Result: " + result);
    }

    public void multiply() {
        double Multiplication1, Multiplication2, result;
        System.out.print("Multiplication1: ");
        Multiplication1 = input.nextInt();
        System.out.print("Multiplication2:");
        Multiplication2 = input.nextInt();
        result = Multiplication1 * Multiplication2;
        System.out.println("Multiplication Result: " + result);
    }
}