package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> crushArray = new ArrayList<>();

        int counter = 0;
        while (true) {
            
            System.out.println("\n(Enter 'q' to quit)");
            System.out.printf("Enter your crush %d name: ", counter + 1);
            String crushInput = scan.nextLine();
            
            counter++;

            if (crushInput.equalsIgnoreCase("q")) {
                break;
            }
            
            crushArray.add(crushInput);
        }
        System.out.println("\nList of your crushes:");
        for (int i = 0; i < crushArray.size(); i++) {
            System.out.printf("- %s\n", crushArray.get(i));
        }

        int randomIndex = random.nextInt(crushArray.size());
        
        System.out.printf("\nTry pursuing your crush (%s).\n", crushArray.get(randomIndex));
    }
}
