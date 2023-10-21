package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter the meal cost: ");
        double mealCostInput = scan.nextDouble();

        System.out.print("Enter tip percentage (in numbers only, ex: 10): ");
        double tipInput = scan.nextInt();

        double convertTip = tipInput / 100;

        double totalBill = mealCostInput + (mealCostInput * convertTip);

        System.out.printf("\nMeal Cost: $%,.02f\n", mealCostInput);
        System.out.printf("Tip percentage: %.0f%%\n", tipInput);
        System.out.printf("Total Bill: $%,.02f\n", totalBill);
    }
}
