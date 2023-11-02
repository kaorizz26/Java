package forDailyCommit;
import java.util.*;

public class commit {

    public static final int PIN_NUMBER = 1234;
    public static double balance = 3000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pinInput;
        System.out.println("\nWelcome to the ATM!");

        try {
            pinInput = getValidPinInput(scan);

            if (pinInput == PIN_NUMBER) {
                handleTransactions(scan);
            }
            else {
                System.out.println("Invalid PIN!");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Input numbers only!");
        }
    }

    public static void handleTransactions(Scanner scan) {
        
        while (true) {
            displayOptions();

            int optionInput = getValidOptionInput(scan);

            switch (optionInput) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scan);
                    break;
                case 3:
                    withdraw(scan);
                    break;
                case 4: 
                    exit();
                    return;

            }
        }
    }

    public static void displayOptions() {
        System.out.println("\nOptions:");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public static void checkBalance() {
        System.out.printf("\nYour balance in your account is P%,.02f\n", balance);
    }

    public static void deposit (Scanner scan) {
        
        try {
            System.out.print("Enter the amount you will deposit: ");
            double depositInput = scan.nextInt();

            if (depositInput > 0) {
                balance += depositInput;
                System.out.printf("\nP%,.02f is deposited in your account\n", depositInput);
                System.out.printf("Your balance in your account is P%,.02f\n", balance);
            }
            else {
                System.out.println("The amount you can deposit must be above zero");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input numbers only!");
        }
    }

    public static void withdraw (Scanner scan) {
        try {
            System.out.print("Enter the amount you will withdraw: ");
            double withdrawInput = scan.nextDouble();

            if (withdrawInput > 0) {
                if (withdrawInput <= balance) {
                    balance -= withdrawInput;
                    System.out.printf("\nP%,.02f have been withdrawn into your account\n", withdrawInput);
                    System.out.printf("Your balance in your account is P%,.02f\n", balance);
                } else {
                    System.out.println("Error: Insufficient funds");
                }
            } else {
                System.out.println("The amount you can withdraw must be above zero!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input numbers only!");
        }
    }

    public static void exit() {
        System.out.println("Thank you for using the ATM. Goodbye!!");
    }

    public static int getValidOptionInput(Scanner scan) {
        int optionInput;

        do {
            System.out.print("\nEnter option (1/2/3/4): ");
            optionInput = scan.nextInt();

        } while (optionInput < 1 || optionInput > 4);
        return optionInput;
    }

    public static int getValidPinInput(Scanner scan) {

        int pinInput;
        do {
            System.out.print("Enter your 4-digit PIN: ");
            pinInput = scan.nextInt();

        } while (pinInput < 1000 || pinInput >9999);
        return pinInput;
    }
}
