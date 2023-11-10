package forDailyCommit;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class commit {

    static LocalDate borrowDate;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");

        int maxDays = 3;
        double penalty = 2;

        int atomicHabitsQty = 1;
        int powerOfNowQty = 2;
        int meditationsQty = 3;

        while (true) {
            
            displayOption(); // * Option menu 

            System.out.print("\nEnter option (number only, e.g. 1): ");
            int optionInput = scan.nextInt();
            scan.nextLine();

            if (optionInput == 1) { //* Borrow Option (1)

                while (true) {

                    displaybookTitles(atomicHabitsQty, powerOfNowQty, meditationsQty);
                    
                    //* Pick the book (input number)
                    System.out.println("\nEnter 'q' to go to option)");
                    System.out.print("Enter number of the book to borrow(e.g. 1): ");
                    String bookNumber = scan.nextLine(); //* Turn to string for quitting book input

                    if (bookNumber.equalsIgnoreCase("q")) { //* go to the option input
                        break;
                    }

                    int bookNumberInput = Integer.parseInt(bookNumber); //* final book input
                    
                    switch (bookNumberInput) {
                        case 1: //* Atomic Habits   

                            // * If book less than 1, return to book list
                            if (atomicHabitsQty < 1) {
                                System.out.println("\nBook is on borrow.");
                                break;
    
                            } else {
                                
                                //* Confirmation input
                                System.out.println("\nThe book is available.");
                                System.out.print("Do you want to borrow the book? (y/n): ");
                                char confirmationInput = scan.next().toLowerCase().charAt(0); 
                                scan.nextLine();
    
                                if (confirmationInput == 'y') { //* If user input 'y'
                                    atomicHabitsQty -= 1;
                                    System.out.println("Sucessfully borrowed"); //* If user input 'n'
                                    
                                } else if (confirmationInput == 'n') {
                                    break;
    
                                } else {
                                    System.out.println("\nEnter 'y' or 'n' only.");
                                    break;
                                }
    
                                //* Borrow date input
                                System.out.println("\nDate should be mm/dd/yyyy (e.g. 11/10/2023)");
                                System.out.print("Enter borrow date (current): ");
                                String borrowDateInput = scan.nextLine();

                                borrowDate = LocalDate.parse(borrowDateInput, formatter);
                                
                            }
                            break;
                        
                        default:
                            break;
    
                    }
                }

            }

            //* Return option (2)
            else if (optionInput == 2) {
                
                displaybookTitles(atomicHabitsQty, powerOfNowQty, meditationsQty); // *Display book title and qty and pass on qty variables

                //* Return book input
                System.out.println("\nEnter 'q' to go to option)");
                System.out.print("Enter number of the book to return (e.g. 1): ");
                String bookNumber = scan.nextLine(); //* Turn to string for quitting book input

                if (bookNumber.equalsIgnoreCase("q")) { //* go to the option input
                    break;
                }

                int bookNumberInput = Integer.parseInt(bookNumber); //* final book input

                switch (bookNumberInput) {
                    case 1:
                        if (atomicHabitsQty >= 1) {
                            System.out.println("Already returned");
                        } else {
                            atomicHabitsQty += 1;

                            //* Return date input
                            System.out.println("\nDate should be mm/dd/yyyy (e.g. 11/10/2023)");
                            System.out.print("Enter return date (current): ");
                            String returnDateInput = scan.nextLine();

                            LocalDate returnDate = LocalDate.parse(returnDateInput, formatter);

                            long between = ChronoUnit.DAYS.between(borrowDate, returnDate);
                            
                            if (between > maxDays) {
                                double charge = (between - maxDays) * penalty;
                                System.out.printf("Additional charges applied (%d days due): PHP%,.02f\n", between - 3, charge);
                            } else {
                                System.out.println("Successfully returned");
                            }
                        }
                        break;
                
                    default:
                        break;
                }
            }

            //* R
            else if (optionInput == 3) {
                System.out.println("Thank you visiting the Library!");
                break;
            } 
            else {
                System.out.println("Input must be from option 1/2/3");
            }

        }
    }

    public static void displayOption() {
        System.out.println("\nOption:");
        System.out.println("1   Borrow");
        System.out.println("2   Return");
        System.out.println("3   Exit");
    }

    public static void displaybookTitles(int atomicHabitsQty, int powerOfNowQty, int meditationsQty) {
        System.out.println("\nList of Books");
        System.out.printf("1 \t Atomic Habits \t Quantity: %d\n", atomicHabitsQty);
        System.out.printf("2 \t Power of Now \t Quantity: %d\n", powerOfNowQty);
        System.out.printf("3 \t Meditations \t Quantity: %d\n", meditationsQty);
    }
}
