package testProjects. generateRandomNumber;
import java.util.Scanner;
import java.util.Random;

public class randomNumButBetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int max, min, result;

        while (true) {
            //* Prompt user for minimum and maximum number:
            System.out.printf("\nEnter minimum number: ");
            min = scan.nextInt();

            System.out.printf("Enter max number: ");
            max = scan.nextInt();
            scan.nextLine();

            //* If min input is greater than max input*/
            if (min > max) {
                System.out.println("Minimum number must be less than maximum number.");
                continue; //* Loop again "Enter minimum number" */
            }
            
            //*Generate the result: */
            System.out.printf("\nGenerating randon number from %d to %d.\n", min, max);
            result = random.nextInt(max - min + 1) + min;
            System.out.println("Result: "+result);

            //* Loop for generating random number again. */
            while (true) {

                System.out.printf("\nGenerate from %d to %d again? (y/n): ", min, max);
                String again = scan.nextLine().toLowerCase();

                //* if user entered q, generate random number again. */
                if (again.equals("y")) {
                    result = random.nextInt(max - min + 1) + min;
                    System.out.println("Result: "+result);
                }
                else if (again.equals("n")) { //* If "n" is input, exit the loop */
                    break;
                }
                else {
                    System.out.println("Invalid input!");
                }
            }

            //* Loop for prompting another set of min and max input. */
            while (true) {

                System.out.printf("\nTry another number? (y/n): ");
                String choice = scan.nextLine().toLowerCase();
                
                //* if equal to y, break then start the loop at first while loop*/
                if (choice.equals("y")) {
                    break;
                }
                else if (choice.equals("n")) { //* If equal to n, end the program. */
                    scan.close();
                    return;
                }
                else { //*if user didn't enter y/n, loop again the prompt */
                    System.out.println("Invalid input!");
                }
            }
        }
    }
}