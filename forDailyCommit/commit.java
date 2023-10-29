package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> thingsArray = new ArrayList<>();


        int counter = 0;

        while (true) {
            System.out.println("\n(Enter 'q' to quit)");
            System.out.printf("Things you want to buy (%d): ", counter + 1);
            String thingsInput = scan.nextLine();

            counter++;

            if (thingsInput.equalsIgnoreCase("q")) {
                break;
            }

            thingsArray.add(thingsInput);

        }

        System.out.println("\nList of things you want to buy:");
        for (int i = 0; i < thingsArray.size(); i++) {
            System.out.printf("- %s\n", thingsArray.get(i));
        }

        int randomIndexThings = random.nextInt(thingsArray.size());
        System.out.printf("\nYou will buy (%s) first\n", thingsArray.get(randomIndexThings));
    }
}
