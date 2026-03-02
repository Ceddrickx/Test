import java.util.Scanner;

public class GradeEvaluator {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student score (0-100): ");

		// I use double instead of int to allow inputs like 85.69 or 92.11
		double score = input.nextDouble();

		// This part checks if the user's input is within the allowed range.
		// If the score is below 0 or above 100, the program will stop
		// and tell the user the input is invalid.
		if (score < 0 || score > 100) {
			System.out.println("Invalid input. Score must be between 0 and 100.");
			input.close();
			return; // Stop program if invalid
		}

		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Letter Grade: " + grade);

		switch (grade) {
			case 'A':
				System.out.println("Excellent! Keep it up!");
				break;

			case 'B':
				System.out.println("Good job!");
				break;

			case 'C':
				System.out.println("Fair. You passed the course.");
				break;

			case 'D':
				System.out.println("You barely passed. Study harder next time.");
				break;

			case 'F':
				System.out.println("Failed. Please review and try again.");
				break;

			default:
				System.out.println("Invalid Grade.");
		}

		input.close();

	}
}