package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> fastFoodArrayList = new ArrayList<>();

        int counter = 0;

        while (true) {
            System.out.println("\nEnter 'q' to quit");
            System.out.printf("Enter fast food place %d: ", counter + 1);
            String fastFoodInput = scan.nextLine();

            counter++;

            if (fastFoodInput.equalsIgnoreCase("q")) {
                break;
            }
            else {
                fastFoodArrayList.add(fastFoodInput);
            }
        }

        System.out.println("\nHere are the fast food place you want to go: ");
        for (int i = 0; i < fastFoodArrayList.size(); i++) {
            System.out.println("- " + fastFoodArrayList.get(i));
        }

        int result = random.nextInt(fastFoodArrayList.size());

        System.out.printf("\nYou will eat at %s!\n", fastFoodArrayList.get(result));
    }
}
