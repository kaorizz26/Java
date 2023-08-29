package randomProjects.SwitchStatement;

import java.util.Scanner;

public class enterCodeWinPrizes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            codeList(); //* Method or function that show the list of codes.
            
            System.out.printf("\nEnter code: ");
            String enterCode = scan.next();

            switch (enterCode) { //* Check if enterCode is equal to cases below.
                case "qwerty":
                    System.out.println("\n\tYou win an IPhone 14 pro!");
                    break;
                case "tryme":
                    System.out.println("\n\tYou win nothing, I'm sorry.");
                    break;
                case "idkpo":
                    System.out.println("\n\tYou win some Starbuck giftcard worth 500 pesos!");
                    break;
                case "ureti":
                    System.out.println("\n\tYou win a lollipop!");
                    break;
                default:
                    System.out.println("\n\tThe code you enter does not exist.");
                    break;
            }
            //* Show user to try again or not:
            System.out.printf("\nEnter again? (y/n): ");
            String choice = scan.next().toLowerCase();

            //* If user is not equal to "y", exit the code:
            if (!choice.equals("y")) {
                System.out.println("Goodbye!");
                break;
            }
        } while (true);
        
        scan.close();
    }

    //* Method for printing the list of codes you can enter:
    public static void codeList() {
        System.out.println("\n\tEnter some code and win prizes!");
        System.out.println("\tHere are the codes you can enter:");
        System.out.println("\t1. qwerty");
        System.out.println("\t2. tryme");
        System.out.println("\t3. idkpo");
        System.out.println("\t4. ureti");
    }
}
