import java.util.Scanner;

public class JohnRay {
    Scanner scan = new Scanner(System.in);
    int num1;
    int num2;

    public JohnRay() {
        System.out.print("Enter num1: ");
        num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        num2 = scan.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Hello Kalawakan");
        JohnRay ao = new JohnRay();
        ao.add();
        ao.subtract();
        ao.division();
        ao.multiply();
    }

    public void add() {
        int sum = num1 + num2;
        System.out.println("Result: " + sum);
    }

    public void subtract() {
        int result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public void multiply() {
        int result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public void division() {
        int result = num1 / num2;
        System.out.println("Result: " + result);
    }
}