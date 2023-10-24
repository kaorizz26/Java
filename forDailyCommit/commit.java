package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {

            System.out.print("\nEnter time (in 24 hour format, ex: 1350): ");
            int timeInput = scan.nextInt();
    
            int hour = timeInput / 100;
            int minute = timeInput % 100;
            String period = "";
    
            if (timeInput > 2359 || minute > 59) {
                System.out.println("\nInvalid Input");
                System.out.println("Cannot take above 23 hours and 59 minutes input!");
            }
            else {
                if (hour >= 0 && hour < 12) {
                    period = "AM";
    
                    if (hour == 0) {
                        hour = 12;
                    }
                }
                else {
                    period = "PM";
                    if (hour != 12) {
                        hour -= 12;
                    }
                }
                System.out.printf("%d:%02d %s\n", hour, minute, period);
                break;
            }
        }
    }
}
