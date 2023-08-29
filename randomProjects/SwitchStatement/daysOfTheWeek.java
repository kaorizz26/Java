package randomProjects.SwitchStatement;
import java.util.Scanner;

public class daysOfTheWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            //* Prompt for input
            System.out.printf("\nEnter a day of the week: ");
            String day = scan.next().toLowerCase();

            //* Use switch to determine day
            switch (day) {
                case "monday":
                    System.out.println("It is Monday.");
                    break;
                case "tuesday":
                    System.out.println("It is Tuesday.");
                    break;
                case "wednesday":
                    System.out.println("It is Wednesday.");
                    break;
                case "thursday":
                    System.out.println("It is Thursday.");
                    break;
                case "friday":
                    System.out.println("It is Friday.");
                    break;
                case "saturday":
                    System.out.println("It is Saturday.");
                    break;
                case "sunday":
                    System.out.println("It is Sunday.");
                    break;
                default: 
                    System.out.println("That is not a day!");
                    break;
            }

            //* Ask for continuation
            System.out.printf("\nEnter again? (y/n): ");
            String choice = scan.next().toLowerCase();

            //* Check if loop should end
            if (!choice.equals("y")) {
                System.out.println("Goodbye!");
                scan.close();
                break;
            }     
        }
    }
}
