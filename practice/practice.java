package practice;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] things = new String[10]; // Initialize with a fixed size

        while (true) {
            System.out.println("\n\tDigital cart:");
            System.out.println("1. Add something.");
            System.out.println("2. Show cart list.");
            System.out.println("3. Remove something.");
            System.out.println("4. Quit");

            System.out.print("Enter choice (number): ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Add something: ");
                    String addThings = scan.nextLine();

                    for (int i = 0; i < things.length; i++) {
                        if (things[i] == null) {
                            things[i] = addThings;
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nCart list:");
                    for (String thing : things) {
                        if (thing != null) {
                            System.out.println(thing);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Remove something: ");
                    String removeThings = scan.next();

                    for (int i = 0; i < things.length; i++) {
                        if (things[i] != null && things[i].equals(removeThings)) {
                            things[i] = null;
                            break;
                        }
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}