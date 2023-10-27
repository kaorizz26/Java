package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> namesArray = new ArrayList<>();

        while (true) {
            System.out.println("\n(Enter 'q' to quit)");
            System.out.print("Enter a name you want to store; ");
            String nameInput = scan.nextLine();
            if (nameInput.equalsIgnoreCase("q")) {
                break;
            }
            namesArray.add(nameInput);
        }

        System.out.print("\nEnter the name you want to find: ");
        String nameFindInput = scan.nextLine();
        
        for (int i = 0; i < namesArray.size(); i++) {

            if (namesArray.get(i).equalsIgnoreCase(nameFindInput)) {
                System.out.println("It is there");
            }
            else {
                System.out.println("Not there");
            }
        }

    }
}
