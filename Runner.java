import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SalesFruitsComputation sales = new SalesFruitsComputation();

        // Display the fruit sales menu
        System.out.println("=|= FRUIT SALES MENU =|=");
        System.out.println("1. Mango");
        System.out.println("2. Apple");
        System.out.println("3. Orange");
        System.out.print("Choose a fruit (1-3): ");

        // Read the user's menu choice
        int choice = input.nextInt();
        input.nextLine(); // Clear the input buffer

        // Decide which fruit method to call based on user input
        if (choice == 1) {
            sales.mango();
        } else if (choice == 2) {
            sales.apple();
        } else if (choice == 3) {
            sales.orange();
        } else {
            System.out.println("Invalid menu option!"); // Handle wrong input
        }

        // Close the scanner to free resources
        input.close();
    }
}