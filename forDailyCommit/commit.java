package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double totalCost = 0;
        int counter = 0;

        System.out.println("\n(Enter 'q' to quit)");
        while (true) {
            
            try {
                System.out.printf("\nEnter item %d price: ", counter + 1);
                String input = scan.nextLine();
                
                counter++;
    
                if (input.equalsIgnoreCase("q")) {
                    break;
                }

                double priceInput = Double.parseDouble(input);
                if (priceInput <= 0) {
                    System.out.println("Please enter positive numbers!");
                    counter--;
                    priceInput = 0;
                }

                totalCost += priceInput;
            } 
            catch (InputMismatchException e) {
                System.out.println("Please enter numeric number!");
                counter--;
            }
            catch (NumberFormatException e) {
                System.out.println("Please Enter 'q' to quit!");
                counter--;
            }
        }

        System.out.printf("\nTotal Cost: P%,.2f\n", totalCost);
    }
}
