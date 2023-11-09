package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String atomicHabits = "Atomic Habits";
        int atomicHabitsQty = 1;

        int optionInput = 0;

        while (optionInput != 3) {
            System.out.println("\nOption:");
            System.out.println("1. Borrow");
            System.out.println("2. Return");
            System.out.println("3. Exit");

            System.out.print("Enter option (number only): ");
            optionInput = scan.nextInt();
            scan.nextLine();

            switch (optionInput) { // * Main switch
                case 1:
                    displaybookList(); 

                    System.out.print("\nEnter book title you want to borrow: "); //* book title input
                    String bookTitleInput = scan.nextLine().toLowerCase(); 
                    
                    switch (bookTitleInput) { // * switch for book title if equal
                        case "atomic habits":
                            System.out.println("Book is available");
                            if (atomicHabitsQty < 1) {
                            System.out.println("The book is on borrow");
                            break;
                            } else {

                                System.out.println("Borrow book? (y/n): "); //* Confirmation input
                                char confirmInput = scan.next().toLowerCase().charAt(0);
        
                                if (confirmInput == 'y') {
                                    atomicHabitsQty -= 1;
                                    System.out.println(atomicHabitsQty); //! test
                                    if (atomicHabitsQty < 1) {
                                        atomicHabits += " (on borrow)";
                                    } 
                                } else if (confirmInput == 'n') {
                                    System.out.println(atomicHabitsQty); //! test
                                    break;
                                } else {
                                    System.out.println("Enter 'y' or 'n' only.");
                                    break;
                                }

                                System.out.println("Enter the borrow date (current date): ");
                                int borrowDateInput = scan.nextInt();


                            }
                        default:
                            System.out.println("Book does not exist");
                            break; // * Book title break
                    }

                    break; // * main switch case 1 break

                case 3:
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }


    public static void displaybookList() {
        System.out.println("\nBooks Available:");
        System.out.println("1. Atomic habits");
        System.out.println("2. Mountain is you");
        System.out.println("3. Think and grow rich");
    }
}