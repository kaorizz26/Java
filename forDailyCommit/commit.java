package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance travelled to your current destination (in km): ");
        double distanceInput = scan.nextDouble();

        System.out.print("Enter time taken to travel in current destination (in hour): ");
        double timeTakenInput = scan.nextDouble();

        double speed = distanceInput / timeTakenInput;

        System.out.printf("Speed: %.02f(km/h)\n", speed);
    }
}
