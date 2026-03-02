import java.util.Scanner;

public class neg {

    Scanner input = new Scanner(System.in);

    public void mango() {
        double small = 20, medium = 35.50, large = 50.25;
        String fruitSize;
        double kilos, totalCost, price = 0;

        System.out.print("Enter Mango size (Small, Medium, Large): ");
        fruitSize = input.next();

        System.out.print("Enter kilos: ");
        kilos = input.nextDouble();

        if (fruitSize.equalsIgnoreCase("small")) {
            price = small;
        } else if (fruitSize.equalsIgnoreCase("medium")) {
            price = medium;
        } else if (fruitSize.equalsIgnoreCase("large")) {
            price = large;
        } else {
            System.out.println("Invalid fruit size.");
            return;
        }

        totalCost = price * kilos;

        System.out.println("\nFruit: Mango");
        System.out.println("Size: " + fruitSize);
        System.out.println("Price per kilo: " + price);
        System.out.println("Kilos: " + kilos);
        System.out.println("Total Cost: " + totalCost);
    }

    public void apple() {
        double small = 25, medium = 40, large = 55;
        String fruitSize;
        double kilos, totalCost, price = 0;

        System.out.print("Enter Apple size (Small, Medium, Large): ");
        fruitSize = input.next();

        System.out.print("Enter kilos: ");
        kilos = input.nextDouble();

        if (fruitSize.equalsIgnoreCase("small")) {
            price = small;
        } else if (fruitSize.equalsIgnoreCase("medium")) {
            price = medium;
        } else if (fruitSize.equalsIgnoreCase("large")) {
            price = large;
        } else {
            System.out.println("Invalid fruit size.");
            return;
        }

        totalCost = price * kilos;

        System.out.println("\nFruit: Apple");
        System.out.println("Size: " + fruitSize);
        System.out.println("Price per kilo: " + price);
        System.out.println("Kilos: " + kilos);
        System.out.println("Total Cost: " + totalCost);
    }

    public void orange() {
        double small = 18, medium = 30, large = 45;
        String fruitSize;
        double kilos, totalCost, price = 0;

        System.out.print("Enter Orange size (Small, Medium, Large): ");
        fruitSize = input.next();

        System.out.print("Enter kilos: ");
        kilos = input.nextDouble();

        if (fruitSize.equalsIgnoreCase("small")) {
            price = small;
        } else if (fruitSize.equalsIgnoreCase("medium")) {
            price = medium;
        } else if (fruitSize.equalsIgnoreCase("large")) {
            price = large;
        } else {
            System.out.println("Invalid fruit size.");
            return;
        }

        totalCost = price * kilos;

        System.out.println("\nFruit: Orange");
        System.out.println("Size: " + fruitSize);
        System.out.println("Price per kilo: " + price);
        System.out.println("Kilos: " + kilos);
        System.out.println("Total Cost: " + totalCost);
    }
}