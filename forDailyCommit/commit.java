package forDailyCommit;
import java.util.Scanner;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter height (in cm): ");
        float enterheight = scan.nextFloat();

        System.out.printf("Enter weight (in kg): ");
        float enterWeight = scan.nextFloat();

        float finalHeight = getFinalHeight(enterheight);

        float bmiResult = enterWeight / finalHeight;

        System.out.printf("\nResult: %.1f\n", bmiResult);

        if (bmiResult < 18.0) {
            System.out.println("UNDERWEIGHT");
        }
        else if (bmiResult < 25.0) {
            System.out.println("NORMAL WEIGHT");
        }
        else if (bmiResult < 29.9) {
            System.out.println("OVERWEIGHT");
        }
        else {
            System.out.println("OBESE");
        }
    }

    public static float getFinalHeight(float enterHeight) {
        enterHeight = enterHeight / 100;
        float result = enterHeight * enterHeight;
        return result;
    }
}
