package testProjects.hypotenuse;
// Import the Scanner class for user input
import java.util.Scanner;

// Define the main class
public class hypoInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object for input
        double a, b, result; // Declare variables for sides and result

        System.out.printf("Side a: "); // Prompt for side a
        a = scan.nextDouble(); // Read side a from user

        System.out.printf("Side b: "); // Prompt for side b
        b = scan.nextDouble(); // Read side b from user

        result = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2))); // Calculate hypotenuse
        System.out.println("\nThe hypotenuse is: " + result); // Display the result
    }
}
