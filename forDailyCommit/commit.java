package forDailyCommit;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class commit {

    static LocalDate borrowDate;
    static LocalDate returnDate;

    static int maxDays = 3;
    static double penalty = 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
        
        //* Book Quantity
        int atomicHabitsQty = 1; //*  BOOK 1
        int maxQtyAtomicHabits = 1;
        
        int powerOfNowQty = 2; //*  BOOK 2
        int maxQtyPowerOfNow = 2;

        int meditationsQty = 3; //*  BOOK 3
        int maxQtyMeditations = 3;

        int deepWorkQty = 1; //*  BOOK 4
        int maxQtydeepWork = 1;

        int alchemistQty = 2; //*  BOOK 5
        int maxQtyAlchemist = 2;

        int untamedQty = 3; //*  BOOK 6
        int maxQtyUntamed = 3;

        int makeYourBedQty = 1; //*  BOOK 7
        int maxQtyMakeYourBed = 1;

        int outliersQty = 2; //*  BOOK 8
        int maxQtyOutliers = 2;

        int gritQty = 3; //*  BOOK 9
        int maxQtyGritQty = 3;

        int duneQty = 1; //*  BOOK 10
        int maxQtyDune = 1;


        while (true) {
            
            displayOption(); //*  * Option menu 

            System.out.print("\nEnter option (number only, e.g. 1): ");
            int optionInput = scan.nextInt();
            scan.nextLine();

            if (optionInput == 1) { //*   Borrow Option (1)

                while (true) {

                    displaybookTitles(atomicHabitsQty, powerOfNowQty, meditationsQty, deepWorkQty, alchemistQty,
                    untamedQty, makeYourBedQty, outliersQty, gritQty, duneQty);
                    //*   Pick the book (input number)
                    System.out.println("\nEnter 'q' to go to option)");
                    System.out.print("Enter number of the book to borrow(e.g. 1): ");
                    String bookNumber = scan.nextLine(); //*   Turn to string for quitting book input

                    if (bookNumber.equalsIgnoreCase("q")) { //*   go to the option input
                        break;
                    }

                    int bookNumberInput = Integer.parseInt(bookNumber); //*   final book input
                    
                    switch (bookNumberInput) {
                        case 1: //*   Atomic Habits   
                            atomicHabitsQty = borrowBookQuantity(scan, atomicHabitsQty, formatter);      
                            break;
                        case 2: //*   Power of Now
                            powerOfNowQty = borrowBookQuantity(scan, powerOfNowQty, formatter);
                            break;
                        case 3: //*   Power of Now
                            meditationsQty = borrowBookQuantity(scan, meditationsQty, formatter);
                            break;
                        case 4: //* Deep Work
                            deepWorkQty = borrowBookQuantity(scan, deepWorkQty, formatter);
                            break;
                        case 5: //* Alchemist
                            alchemistQty = borrowBookQuantity(scan, alchemistQty, formatter);
                            break;
                        case 6: //* Untamed
                            untamedQty = borrowBookQuantity(scan, untamedQty, formatter);
                            break;
                        case 7: //* Make you bed
                            makeYourBedQty = borrowBookQuantity(scan, makeYourBedQty, formatter);
                            break;
                        case 8: //* Outliers
                            outliersQty = borrowBookQuantity(scan, outliersQty, formatter);
                            break;
                        case 9: //* Grt
                            gritQty = borrowBookQuantity(scan, gritQty, formatter);
                            break;
                        case 10: //* Dune
                            duneQty = borrowBookQuantity(scan, duneQty, formatter);
                            break;
                        default:
                            break;
    
                    }
                }

            }
            //*   Return option (2)
            else if (optionInput == 2) {
                
                while (true) {

                    displaybookTitles(atomicHabitsQty, powerOfNowQty, meditationsQty, deepWorkQty, alchemistQty,
                    untamedQty, makeYourBedQty, outliersQty, gritQty, duneQty); //*  *Display book title and qty and pass on qty variables
    
                    //*   Return book input
                    System.out.println("\nEnter 'q' to go to option)");
                    System.out.print("Enter number of the book to return (e.g. 1): ");
                    String bookNumber = scan.nextLine(); //*   Turn to string for quitting book input
    
                    if (bookNumber.equalsIgnoreCase("q")) { //*   go to the option input
                        break;
                    }
    
                    int bookNumberInput = Integer.parseInt(bookNumber); //*   final book input
    
                    switch (bookNumberInput) {
    
                        case 1:
                            atomicHabitsQty = returnBookQuantity(scan, atomicHabitsQty, formatter, maxQtyAtomicHabits);
                            break;
                        case 2:
                            powerOfNowQty = returnBookQuantity(scan, powerOfNowQty, formatter, maxQtyPowerOfNow);
                            break;
                        case 3:
                            meditationsQty = returnBookQuantity(scan, meditationsQty, formatter, maxQtyMeditations);
                            break;
                        case 4:
                            deepWorkQty = returnBookQuantity(scan, deepWorkQty, formatter, maxQtydeepWork);
                            break;
                        case 5: 
                            alchemistQty = returnBookQuantity(scan, alchemistQty, formatter, maxQtyAlchemist);
                            break;
                        case 6:
                            untamedQty = returnBookQuantity(scan, untamedQty, formatter, maxQtyUntamed);
                            break;
                        case 7: 
                            makeYourBedQty = returnBookQuantity(scan, makeYourBedQty, formatter, maxQtyMakeYourBed);
                            break;
                        case 8: //* Outliers
                            outliersQty = returnBookQuantity(scan, outliersQty, formatter, maxQtyOutliers);
                            break;
                        case 9: //* Grt
                            gritQty = returnBookQuantity(scan, gritQty, formatter, maxQtyGritQty);
                            break;
                        case 10: //* Dune
                            duneQty = returnBookQuantity(scan, duneQty, formatter, maxQtyDune);
                            break;
                        default:
                            break;
                    }
                }
            }

            //*   Exit Option (3)
            else if (optionInput == 3) {
                System.out.println("Thank you visiting the Library!");
                break;
            } 
            else {
                System.out.println("Input must be from option 1/2/3");
            }

        }
    }


    public static int returnBookQuantity(Scanner scan, int bookQty, DateTimeFormatter formatter, int maxQty) {
        if (bookQty >= maxQty) {
            System.out.println("Already returned");
            return bookQty;
        } else {

            bookQty += 1;

            //*   Return date input
            System.out.println("\nDate should be mm/dd/yyyy (e.g. 11/10/2023)");
            System.out.print("Enter return date (current): ");
            String returnDateInput = scan.nextLine();

            LocalDate returnDate = LocalDate.parse(returnDateInput, formatter);
            long between = ChronoUnit.DAYS.between(borrowDate, returnDate);
            
            if (between > maxDays) {
                double charge = (between - maxDays) * penalty;
                System.out.printf("\nAdditional charges applied (%d days due): PHP%,.02f\n", between - 3, charge);
                System.out.println("Sucessfully returned");
            } else {
                System.out.println("\nNo additional charges");
                System.out.println("Sucessfully returned");

            }
        }
        return bookQty;
    }


    public static int borrowBookQuantity(Scanner scan, int bookqty, DateTimeFormatter formatter) {
        if (bookqty < 1) {
            System.out.println("\nBook is on borrow.");
            return bookqty;

        } else {
            
            //*   Confirmation input
            System.out.println("\nThe book is available.");
            System.out.print("Do you want to borrow the book? (y/n): ");
            char confirmationInput = scan.next().toLowerCase().charAt(0); 
            scan.nextLine();

            if (confirmationInput == 'y') { //*   If user input 'y'
                bookqty = bookqty - 1;
                System.out.println(bookqty);
                
            } else if (confirmationInput == 'n') { //*   If user input 'n'
            return bookqty;
            
        } else {
            System.out.println("\nEnter 'y' or 'n' only.");
            return bookqty;
        }
        
        //*   Borrow date input
        System.out.println("\nDate should be mm/dd/yyyy (e.g. 11/10/2023)");
        System.out.print("Enter borrow date (current): ");
        String borrowDateInput = scan.nextLine();
        
        borrowDate = LocalDate.parse(borrowDateInput, formatter);
        System.out.println("Sucessfully borrowed"); 
        }
        return bookqty;
    }


    public static void displayOption() {
        System.out.println("\nOption:");
        System.out.println("1   Borrow");
        System.out.println("2   Return");
        System.out.println("3   Exit");
    }


    public static void displaybookTitles(int atomicHabitsQty, int powerOfNowQty, int meditationsQty, 
    int deepWorkQty, int alchemistQty, int untamedQty, int makeYourBedQty, int outliersQty, 
    int gritQty, int duneQty) {
        System.out.println("\n\tList of Books");
        System.out.printf("1     Atomic Habits \t Quantity: %d\n", atomicHabitsQty);
        System.out.printf("2     Power of Now \t Quantity: %d\n", powerOfNowQty);
        System.out.printf("3     Meditations \t Quantity: %d\n", meditationsQty);
        System.out.printf("4     Deep Work \t Quantity: %d\n", deepWorkQty);
        System.out.printf("5     Alchemist \t Quantity: %d\n", alchemistQty);
        System.out.printf("6     Untamed    \t Quantity: %d\n", untamedQty);
        System.out.printf("7     Make your Bed  \t Quantity: %d\n", makeYourBedQty);
        System.out.printf("8     Outliers   \t Quantity: %d\n", outliersQty);
        System.out.printf("9     Grit       \t Quantity: %d\n", gritQty);
        System.out.printf("10    Dune       \t Quantity: %d\n", duneQty);
        System.out.print("");
    }
}
