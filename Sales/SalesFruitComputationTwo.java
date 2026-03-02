import java.util.Scanner;

public class SalesFruitComputationTwo {

    Scanner input = new Scanner(System.in);

    public void mango() {
        double small = 20;
        double medium = 35.50;
        double large = 50.25;

        String fruitSize;
        double cost = 0;
        double kilos;

        System.out.print("Enter Mango size (small, medium, large): ");
        fruitSize = input.nextLine();

        System.out.print("How many kilos will you buy? ");
        kilos = input.nextDouble();

        if (fruitSize.equalsIgnoreCase("small")) {
            cost = small;
        } else if (fruitSize.equalsIgnoreCase("medium")) {
            cost = medium;
        } else if (fruitSize.equalsIgnoreCase("large")) {
            cost = large;
        } else {
            System.out.println("Invalid size");
            return;
        }

        double totalCost = cost * kilos;
        System.out.println("Cost: " + totalCost);
    }

    public static void main(String[] args) {
        SalesFruitComputationTwo sales = new SalesFruitComputationTwo();
        sales.mango();
    }
}