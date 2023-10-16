package forDailyCommit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> crushes = new ArrayList<String>();

        
        int counter = 0;
        while (true) {
            System.out.printf("Enter your crush %d name: ", counter + 1);
            String crushInput = scan.nextLine();
            counter++;
            
            if (crushInput.equalsIgnoreCase("q")) {
                break;
            }
            else {
                crushes.add(crushInput);
            }
        }

        int resultWife = random.nextInt(crushes.size());

        System.out.printf("Your future wife will be: %s\n", crushes.get(resultWife));    
    }
}
