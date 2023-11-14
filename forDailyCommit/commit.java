package forDailyCommit;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;;

public class commit {

    final static int MAX_DAYS = 3;
    final static double PENALTY = 2.00;

    // *Arrays to store book details
    static String[] bookTitleArray = {
        "Berserk",
        "One Piece",
        "Kindom"
    };
    static LocalDate[] borrowDate = new LocalDate[bookTitleArray.length];
    static LocalDate[] returnDate = new LocalDate[bookTitleArray.length];
    static boolean[] hasBorrowed = new boolean[bookTitleArray.length];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // *Arrays to track available copies and maximum copies for each book
        int[] bookCopyArray = {1, 2, 3};
        int[] maxBookCopyArray = {1, 2, 3};

        System.out.println("Welcome to the Library!");

        // *Main menu loop
        while (true) {
            displayOption(); // *Display library options (borrow, return, exit)

            System.out.print("Enter option 1/2/3: ");
            int optionInput = scan.nextInt();
            scan.nextLine(); // *Consume the newline character

            // *Switch statement to handle user choices
            switch (optionInput) {
                case 1:
                    borrowBook(scan, bookCopyArray, maxBookCopyArray, formatter);
                    break;
                case 2:
                    returnBook(scan, bookCopyArray, maxBookCopyArray, formatter);
                    break;
                case 3:
                    System.out.println("\nQuitting library...");
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("\nEnter only 1/2/3!");
                    break;
            }
        }
    }

    // *Function to handle book borrowing
    public static void borrowBook(Scanner scan, int[] bookCopyArray, int[] maxBookCopyArray, DateTimeFormatter formatter) {
        // *Borrowing loop
        while (true) {
            displayBookTitle(bookCopyArray, maxBookCopyArray); // *Display available books and copies

            System.out.println("\nEnter 'q' to return to options");
            System.out.print("Enter number of book to borrow: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("q")) {
                return;
            }

            int bookNumberInput = Integer.parseInt(input);

            if (bookNumberInput >= 1 && bookNumberInput <= bookTitleArray.length) {
                int index = bookNumberInput - 1;
                int bookCopy = bookCopyArray[index];

                // *Check if the book is available for borrowing
                if (hasBorrowed[index]) {
                    System.out.printf("\nYou can only borrow one copy of '%s'\n", bookTitleArray[index]);
                } else {
                    hasBorrowed[index] = true;

                    // *Check if there are available copies of the book
                    if (bookCopy < 1) {
                        System.out.printf("\nThe book '%s' is currently on loan\n", bookTitleArray[index]);
                    } else {
                        // *Prompt user for confirmation to borrow
                        System.out.printf("\nThe book '%s' is available!\n", bookTitleArray[index]);
                        System.out.print("Do you want to borrow the book? (y/n): ");
                        char confirmationInput = scan.next().toLowerCase().charAt(0);
                        scan.nextLine(); // *Consume the newline character

                        if (confirmationInput == 'y') {
                            bookCopy -= 1;
                            bookCopyArray[index] = bookCopy;

                            // *Get borrow date from the user
                            System.out.println("\nDate format: (mm/dd/yyyy), e.g. 11/13/2023");
                            System.out.print("Enter borrow date: ");
                            String inputBorrowDate = scan.nextLine();
                            borrowDate[index] = LocalDate.parse(inputBorrowDate, formatter);

                            System.out.printf("\nSuccessfully borrowed '%s'\n", bookTitleArray[index]);

                        } else if (confirmationInput == 'n') {
                            bookCopyArray[index] = bookCopy;
                        } else {
                            System.out.println("Only input 'y' or 'n'");
                        }
                    }
                }
            } else {
                System.out.println("\nBook does not exist.");
            }
        }
    }

    // *Function to handle book returns
    public static void returnBook(Scanner scan, int[] bookCopyArray, int[] maxBookCopyArray, DateTimeFormatter formatter) {
        // *Returning loop
        while (true) {
            displayBookTitle(bookCopyArray, maxBookCopyArray); // *Display borrowed books

            System.out.println("\nEnter 'q' to return to options.");
            System.out.print("Enter number of book to return: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("q")) {
                return;
            }

            int bookNumberInput = Integer.parseInt(input);

            if (bookNumberInput >= 1 && bookNumberInput <= bookTitleArray.length) {
                int index = bookNumberInput - 1;
                int bookCopy = bookCopyArray[index];
                int maxBookCopy = maxBookCopyArray[index];

                // *Check if the book has been borrowed
                if (bookCopy < maxBookCopy) {
                    bookCopy += 1;
                    bookCopyArray[index] = bookCopy;

                    // *Get return date from the user
                    System.out.printf("\nReturning '%s'....\n", bookTitleArray[index]);
                    System.out.println("\nDate format: (mm/dd/yyyy), e.g. 11/13/2023");
                    System.out.print("Enter return date: ");
                    String inputReturnDate = scan.nextLine();
                    returnDate[index] = LocalDate.parse(inputReturnDate, formatter);

                    // *Calculate and display any additional charges
                    long between = ChronoUnit.DAYS.between(borrowDate[index], returnDate[index]);
                    if (between > MAX_DAYS) {
                        double charge = (between - MAX_DAYS) * PENALTY;
                        System.out.printf("\nAdditional Charge (%d day/s overdue): PHP%,.02f\n", between - MAX_DAYS, charge);
                    }
                    System.out.printf("Successfully returned '%s'\n", bookTitleArray[index]);
                } else {
                    System.out.println("\nBorrow a book first before returning.");
                }
            } else {
                System.out.println("\nBook does not exist.");
            }
        }
    }

    // *Function to display the list of available books and copies
    public static void displayBookTitle(int[] bookCopyArray, int[] maxBookCopyArray) {
        System.out.println("\n\tList of Books:");
        for (int i = 0; i < bookTitleArray.length; i++) {
            System.out.printf("%d   \t%s    \tCopy: %d/%d\n", i + 1, bookTitleArray[i], 
            bookCopyArray[i], maxBookCopyArray[i]);
        }
    }

    // *Function to display available options in the library
    public static void displayOption() {
        System.out.println("\nOption:");
        System.out.println("1   Borrow");
        System.out.println("2   Return");
        System.out.println("3   Exit");
    }
}