package testProjects.generateRandomNumber;
import java.util.Random;
import java.util.Scanner;

public class randomInput {
    public static void main(String[] args) {

        //* Initialize scanner for input
        Scanner scanner = new Scanner(System.in);
        
        //* Initialize random number generator
        Random random = new Random();

        //* Declare variables
        int maxNumber, minNumber, generatedNumber;

        //* Get max number from user
        System.out.print("\nEnter max number: ");
        maxNumber = scanner.nextInt();

        //* Get min number from user
        System.out.print("Enter minimum number: ");
        minNumber = scanner.nextInt();

        //* Generate and display random number
        System.out.printf("\nGenerating random number between %d and %d.\n", minNumber, maxNumber);
        generatedNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        System.out.println("Random number: " + generatedNumber);

        //* Close the scanner
        scanner.close();
    }
}
