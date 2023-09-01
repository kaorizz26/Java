package mainProjects.orderFood;

import java.util.Scanner;

public class order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Chez Food Grill!");

            //* Display the food menu codes
            displayFoodMenuCodes();

            //* Prompt user for the number of orders
            System.out.print("\nEnter the number of orders: ");
            int numOfOrders = scan.nextInt();
            scan.nextLine();

            String[] ordersArray = new String[numOfOrders]; //* Create an array to store orders

            for (int i = 0; i < numOfOrders; i++) {
                //* Prompt the user for their order
                System.out.printf("Order %d: ", i + 1);
                String foodCode = scan.next().toLowerCase();
                scan.nextLine();
                
                //* Check if the user input is a valid food code
                String foodOrder = getFoodItem(foodCode);

                if (foodOrder != null) {
                    ordersArray[i] = foodOrder; //* Add the order to the array
                } else {
                    i--; //* Decrement to retry order input
                }
            }

            //* Display the user's orders
            System.out.println("\nOrder Summary:");
            for (int i = 0; i < numOfOrders; i++) {
                System.out.printf("\t%s\n", ordersArray[i]);
            }

            //* Prompt if the user wants to order again
            while (true) {
                System.out.print("\nOrder again (y/n): ");
                String choice = scan.next();

                if (choice.equals("y")) {
                    break;
                } else if (choice.equals("n")) {
                    scan.close();
                    return;
                } else {
                    System.out.println("Invalid Input!");
                }
            }
        }
    }

    //* Display the food menu codes
    public static void displayFoodMenuCodes() {
        System.out.println("\n\tChez Food Menu (codes): ");
        System.out.println("\tA1 - Chicken Inasal");
        System.out.println("\tA2 - Butter Chicken");
        System.out.println("\tA3 - Sizzling Sisig");
        System.out.println("\tB1 - Melon Soda");
        System.out.println("\tB2 - Ice Tea");
    }

    //* Check if the user's code matches a food item
    public static String getFoodItem(String code) {
        String foodItem = null;

        switch (code) {
            case "a1":
                foodItem = "Chicken Inasal";
                break;
            case "a2":
                foodItem = "Butter Chicken";
                break;
            case "a3":
                foodItem = "Sizzling Sisig";
                break;
            case "b1":
                foodItem = "Melon Soda";
                break;
            case "b2":
                foodItem = "Ice Tea";
                break;
            default:
                System.out.println("Invalid code.");
                break;
        }

        return foodItem;
    }
}
