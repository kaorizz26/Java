package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int randomNum = random.nextInt(10) + 1;
        int counter = 5;
        
        for (int i = 5; i > 0; i--) {
            
            System.out.printf("\nGuess the number between 1 to 6 (%d tries left): ", i);
            int guessNumInput = scan.nextInt();

            if (guessNumInput < 1 || guessNumInput > 6) {
                System.out.println("Number must be from 1 - 6!");
                i++;
            }
            else {
                if (guessNumInput == randomNum) {
                    System.out.println("You guess it!!!");
                    break;
                }
                else {
                    System.out.println("Wrong!!!!");
                    counter--;
                }
            }
        }

        if (counter == 0) {
            System.out.println("Try again");
        }
    }
}
