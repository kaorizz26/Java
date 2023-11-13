package forDailyCommit;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class commit {

    //* Variables to store borrow and return dates, penalty, and max days
    static LocalDate borrowDate;
    static LocalDate returnDate;
    static double penalty = 2.00;
    static int maxDays = 3;

    //* Array to store book titles
    static String[] bookTitleArray = {
        "Untamed",
        "Grit",
        "Dune"
    };

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //* DateTimeFormatter for date parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //* Arrays to track available and maximum book copies
        int[] bookCopyArray = {1, 2, 3};
        int[] maxBookCopyArray = {1, 2, 3};

        //* Main loop for user interaction
        while (true) {

            //* Display user options
            displayOption();

            //* Prompt user to choose an option
            System.out.print("Enter option 1/2/3: ");
            int optionInput = scan.nextInt();
            scan.nextLine();

            //* Switch case based on user's option
            switch (optionInput) {
                case 1: 
                    borrowBook(scan, bookCopyArray, maxBookCopyArray, formatter);
                    break;

                case 2:
                    returnBook(scan, bookCopyArray, maxBookCopyArray, formatter);
                    break;

                case 3:
                    System.out.println("\nThank you for using the library, goodbye!!!");
                    return;

                default:
                    System.out.println("Input only 1/2/3");
                    break;
            }
        }
    }


    //*  Borrow methods (option 1)
    //* Method for borrowing a book
    public static void borrowBook(Scanner scan, int[] bookCopyArray, int[] maxBookCopyArray, DateTimeFormatter formatter) {

        while (true) {

            displaybookTitles(bookCopyArray, maxBookCopyArray); //* *Display Book title and copy

            System.out.println("\nEnter 'q' to return in option.");
            System.out.print("Enter the number of book to borrow: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("q")) {
                return;
            }

            int bookNumberInput = Integer.parseInt(input); //* * Change string to (int)

            if (bookNumberInput >= 1 && bookNumberInput <= bookTitleArray.length) {
                int index = bookNumberInput - 1;
                int bookCopy = bookCopyArray[index];

                bookCopyArray[index] = borrowBookProcess(scan, bookCopy, formatter, index);
            } else {
                System.out.println("Book doesn't exist!");
            }
        }
    }

    //* Method for processing the book borrowing
    public static int borrowBookProcess(Scanner scan, int bookCopy, DateTimeFormatter formatter, int index) {

        if (bookCopy < 1) {
            System.out.println("\nThe book is on borrow!");
            return bookCopy;
        } else {
            System.out.println("\nThe book is available!");

            System.out.print("\nDo you want to borrow this book? (y/n): ");
            char confirmationInput = scan.next().toLowerCase().charAt(0);
            scan.nextLine();
    
            if (confirmationInput == 'y') {
                bookCopy -= 1;

            } else if (confirmationInput == 'n') {
                return bookCopy;
            } else {
                System.out.println("Invalid input, only input 'y' or 'n'");
                return bookCopy;
            }
            
            System.out.println("\nDate should be entered (mm/dd/yyyy), e.g. 11/10/2023");
            System.out.print("Enter borrow date (current) : ");
            String borrowInput = scan.nextLine();

            borrowDate = LocalDate.parse(borrowInput, formatter);
            System.out.printf("Sucessfully borrowed the book ('%s')\n", bookTitleArray[index]);
        }
        return bookCopy;
    }


    //*  Return methods (option 2)
    //* Method for returning a book
    public static void returnBook(Scanner scan, int[] bookCopyArray, int[] maxBookCopyArray, DateTimeFormatter formatter) {
        while (true) {

            displaybookTitles(bookCopyArray, maxBookCopyArray); //* *Display Book title and copy

            System.out.println("\nEnter 'q' to return in option.");
            System.out.print("Enter the number of book to return: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("q")) {
                return;
            }

            int bookNumberInput = Integer.parseInt(input); //* * Change string to (int)

            if (bookNumberInput >= 1 && bookNumberInput <= bookTitleArray.length) {
                int index = bookNumberInput - 1;
                int bookCopy = bookCopyArray[index];
                int maxBookCopy = maxBookCopyArray[index];

                bookCopyArray[index] = returnBookProcess(scan, bookCopy, maxBookCopy, formatter, index);
            } else {
                System.out.println("Book doesn't exist!");
            }
        }
    }


    //* Method for processing the book return
    public static int returnBookProcess(Scanner scan, int bookCopy, int maxBookCopy, DateTimeFormatter formatter, int index) {
        if (bookCopy >= maxBookCopy) {
            System.out.println("Aready returned");
            return bookCopy;
        } else {
            bookCopy += 1;

            System.out.println("\nDate should be entered (mm/dd/yyyy), e.g. 11/10/2023");
            System.out.print("\nEnter return date (current): ");
            String input = scan.nextLine();

            returnDate = LocalDate.parse(input, formatter);

            long between = ChronoUnit.DAYS.between(borrowDate, returnDate);

            if (between > maxDays) {
                double charge = (between - maxDays) * penalty;
                System.out.printf("Additional charge (%d day/s due): PHP%,.02f\n", between - maxDays, charge);
            }
            System.out.printf("Sucessfully returned the book ('%s')\n", bookTitleArray[index]);
        }
        return bookCopy;
    }


    //* Method to display user options
    public static void displayOption() {
        System.out.println("\nOption:");
        System.out.println("1   Borrow");
        System.out.println("2   Return");
        System.out.println("3   Exit");
    }


    //* Method to display book titles with available copies and max copies
    public static void displaybookTitles(int[] bookCopyArray, int[] maxBookCopyArray) {
        System.out.println("\n\tList of Books:");
        for (int i = 0; i < bookTitleArray.length; i++) {
            System.out.printf("%d   \t%s    \tCopy; %d/%d\n", i + 1, bookTitleArray[i], 
            bookCopyArray[i], maxBookCopyArray[i]);
        }
    }
}
