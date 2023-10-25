package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final double chargePerCylinder = 13.45;
        double discount = 0.06;
        
        //* Input for number of cylinders */
        System.out.print("Enter number of cylinders: "); //*Amount of cylinders */
        double numOfCylinderInput = scan.nextDouble();
        
        double initialCost = 0.0;
        initialCost = numOfCylinderInput * chargePerCylinder;
        
        //* Display amount: */
        System.out.printf("Amount: P%,.02f%n", initialCost); //* amount
        
        double amountCylinder = 0.0; //* Counter for total of cylinder */

        if (numOfCylinderInput >= 4) {
            amountCylinder += numOfCylinderInput + 1;
        }
        else {
            amountCylinder += numOfCylinderInput;
        }

        //* Total of cylinders */
        System.out.printf("Total cylinders to be delivered: %.0f\n", amountCylinder);


        double change = 0.0;

        //* Payment input */
        System.out.print("\nEnter payment: ");
        double payment = scan.nextDouble();

        if (payment > 200) { //* Above 200, minus 6% discount */
            payment = payment - (payment * discount);
        }


        change = payment - initialCost; //* final money or change */

        System.out.printf("Change: P%,.02f\n", change);
    }
}
