package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Get more than 5 books | Get 10% discount!!!");
        System.out.println("-------------------------------------------");

        double totalCost = 0.0;
        double discount = 0.10;

        while (true) {
            System.out.print("\nEnter book price: ");
            double bookPriceInput = scan.nextDouble();

            System.out.print("Enter quantity: "); 
            double quantityInput = scan.nextDouble();

            if (bookPriceInput <= 0 || quantityInput <= 0) {
                System.out.println("Price and quantity must be above 0!");
            }
            else {
                if (quantityInput > 5) {
                    bookPriceInput = bookPriceInput - (bookPriceInput * discount);
                    totalCost = bookPriceInput * quantityInput;
                }
                else {
                    totalCost = bookPriceInput * quantityInput;
                }
                break;
            }
        }
        System.out.printf("\nTotal Cost: P%,.02f%n", totalCost);    
    }
}
