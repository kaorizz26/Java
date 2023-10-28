package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        final double GL_MODEL = 420_000;
        final double XL_MODEL = 390_000;
        final double WITH_CAR_PHONE = 40_000;
        final double DISCOUNT = 0.20;

        double cost = 0.0;

        System.out.print("Enter car model ('GL' | 'XL'): ");
        String carModelInput = scan.nextLine();

        if (carModelInput.equalsIgnoreCase("GL")) {
            cost = GL_MODEL;
        }
        else if (carModelInput.equalsIgnoreCase("XL")) {
            cost = XL_MODEL;
        }
        else {
            cost = 0;
        }

        System.out.println("('W' - with car phone | 'O' - without car phone)");
        System.out.print("Enter code: ");
        char carPhoneInput = scan.next().toUpperCase().charAt(0);

        if (carPhoneInput == 'W') {
            cost += WITH_CAR_PHONE;
        }
        else if (carPhoneInput == 'O') {
            cost += 0;
        }

        System.out.println("('F' - full payment | 'I' - installment)");
        System.out.print("Enter code: ");
        char paymentInput = scan.next().toUpperCase().charAt(0);

        if (paymentInput == 'F') {
            cost = cost - (cost * DISCOUNT);
        }

        double finalCost = 0.0;

        finalCost += cost;

        System.out.printf("Total Cost: P%,.2f\n", finalCost);

    }
}
