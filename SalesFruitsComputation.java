import java.util.Scanner;

public class SalesFruitsComputation {

    Scanner input = new Scanner(System.in);

    public void mango() {
        double small = 20.00;
        double medium = 35.50;
        double large = 50.25;

        String fruitSize;
        double kilos;
        double pricePerKilo = 0;

        System.out.print("Enter Mango size (Small, Medium, Large): ");
        fruitSize = input.nextLine();

        System.out.print("Enter number of kilos: ");
        kilos = input.nextDouble();
        input.nextLine();

        if (fruitSize.equalsIgnoreCase("Small")) {
            pricePerKilo = small;
        } else if (fruitSize.equalsIgnoreCase("Medium")) {
            pricePerKilo = medium;
        } else if (fruitSize.equalsIgnoreCase("Large")) {
            pricePerKilo = large;
        } else {
            System.out.println("Invalid fruit size!");
            return;
        }

        double totalCost = pricePerKilo * kilos;

        System.out.println("\nFruit: Mango");
        System.out.println("Size: " + fruitSize);
        System.out.println("Price per kilo: " + pricePerKilo);
        System.out.println("Kilos: " + kilos);
        System.out.println("Total cost: " + totalCost);
    }

    public void apple() {
        double small = 30.00;
        double medium = 45.00;
        double large = 60.00;

        String fruitSize;
        double kilos;
        double pricePerKilo = 0;

        System.out.print("Enter Apple size (Small, Medium, Large): ");
        fruitSize = input.nextLine();

        System.out.print("Enter number of kilos: ");
        kilos = input.nextDouble();
        input.nextLine();

        if (fruitSize.equalsIgnoreCase("small")) {
            pricePerKilo = small;
        } else if (fruitSize.equalsIgnoreCase("medium")) {
            pricePerKilo = medium;
        } else if (fruitSize.equalsIgnoreCase("large")) {
            pricePerKilo = large;
        } else {
            System.out.println("Invalid fruit size!");
            return;
        }

        double totalCost = pricePerKilo * kilos;

        System.out.println("\nFruit: Apple");
        System.out.println("Size: " + fruitSize);
        System.out.println("Price per kilo: " + pricePerKilo);
        System.out.println("Kilos: " + kilos);
        System.out.println("Total cost: " + totalCost);
    }

    public void orange() {
        double small = 25.00;
        double medium = 40.00;
        double large = 55.00;

        String fruitSize;
        double kilos;
        double pricePerKilo = 0;

        System.out.print("Enter Orange size (Small, Medium, Large): ");
        fruitSize = input.nextLine();

        System.out.print("Enter number of kilos: ");
        kilos = input.nextDouble();
        input.nextLine();

        if (fruitSize.equalsIgnoreCase("small")) {
            pricePerKilo = small;
        } else if (fruitSize.equalsIgnoreCase("medium")) {
            pricePerKilo = medium;
        } else if (fruitSize.equalsIgnoreCase("large")) {
            pricePerKilo = large;
        } else {
            System.out.println("Invalid fruit size!");
            return;
        }

        double totalCost = pricePerKilo * kilos;

        System.out.println("\nFruit: Orange");
        System.out.println("Size: " + fruitSize);
        System.out.println("Price per kilo: " + pricePerKilo);
        System.out.println("Kilos: " + kilos);
        System.out.println("Total cost: " + totalCost);
    }
}