package forDailyCommit;
import java.util.*;

public class commit {

    static final int PIN_NUMBER = 1234;
    static double balance = 2500;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pinInput;

        while (true) {
            
            pinInput = getValidPinInput(scan);
            scan.nextLine();
            if (pinInput == PIN_NUMBER) {
                handleTransactions(scan);
            } else {
                System.out.println("Invalid PIN!");
            }

            while (true) {
                System.out.print("\nDo you want to try again (y/n): ");
                String choice = scan.nextLine();
    
                if (!choice.equalsIgnoreCase("y")) {
                    return;
                }
                break;
            }
        }
    }


    static void handleTransactions(Scanner scan) {
        int optionInput;
    
        while (true) {
            displayMenu();

            optionInput = getValidOptionInput(scan);
            scan.nextLine();

            switch (optionInput) {
                case 1:
                    System.out.printf("You have P%,.02f in your account.\n", balance);
                    break;
                case 2: 
                    System.out.println("Enter the amount you will deposit: ");
                    double depositInput = scan.nextDouble();

                    balance += depositInput;

                    if (depositInput > 0) {
                        System.out.printf("P%,.02f is deposited in your account.\n", depositInput);
                        System.out.printf("You have P%,.02f in your account.\n", balance);
                    } else {
                        System.out.println("The amount you can deposit must be above zero!");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount you will withdraw: ");
                    double withdrawInput = scan.nextDouble();

                    if (withdrawInput > 0) {
                        if (withdrawInput <= balance) {
                            balance -= withdrawInput;
                            System.out.printf("P%,.02f is withdrawn in your account.\n", withdrawInput);
                            System.out.printf("You have P%,.02f in your account.\n", balance);

                        } else {
                            System.out.println("Error: Insufficient funds!");
                        }
                    } else {
                        System.out.println("The amount you can withdraw must be above zero!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }


    static int getValidOptionInput(Scanner scan) {
        int optionInput;

        while (true) {
            System.out.print("\nEnter option (1/2/3/4): ");
            optionInput = scan.nextInt();

            if (optionInput <= 0 || optionInput > 4) {
                System.out.println("\nInput numbers from 1 - 4 only");
            }
            else {
                break;
            }
        }
        return optionInput;
    }
    

    static int getValidPinInput(Scanner scan) {
        int pinInput;

        while (true) {
            System.out.print("Enter your 4-digit PIN: ");
            pinInput = scan.nextInt();

            if (pinInput < 1000 || pinInput > 9999) {
                System.out.println("\nPIN must be 4 digit!");
            }
            else {
                break;
            }
        }

        return pinInput;
    }


    static void displayMenu() {
        System.out.println("\nOption:");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
}
