
public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);

            // Inner loop: iterates from 1 to 2
            for (int j = 1; j <= 2; j++) {
                System.out.println("  Inner loop iteration: " + j);
            }
        }

    }
}