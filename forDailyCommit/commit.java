package forDailyCommit;
import java.util.Scanner;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double overallTotalCost = 0.0;
        int numItems = 3;
        double[] prices = new double[numItems];
        double[] quantities = new double[numItems];
        double[] totalCost = new double[numItems];
        
        for (int i = 0; i < numItems; i++) {
            System.out.print("\nEnter price of item " + (i + 1) + ": ");
            prices[i] = scan.nextDouble();
            System.out.print("Quantity: ");
            quantities[i] = scan.nextDouble();

            if (prices[i] < 0 || quantities[i] < 0) {
                System.out.println("Price and quantity must be non-negative. Please re-enter.");
                i--; // Decrement i to repeat the current item input.
            } else {
                double Cost = prices[i] * quantities[i];

                totalCost[i] = Cost;

                overallTotalCost += Cost;
            }
        }

        System.out.println();
        for (int i = 0; i < numItems; i++) {
            System.out.printf("Total Cost of item %d: %,.02f\n", i + 1, totalCost[i]);
        }

        System.out.printf("\nOverall Cost: $%,.02f\n", overallTotalCost);
    }
}
