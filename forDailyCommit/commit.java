package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you height (in meters): ");
        double height = scan.nextDouble();

        System.out.print("Enter your weight (in kg): ");
        double weight = scan.nextDouble();

        double result = weight / (height * height); //* BMI result

        String categoryBMI = "";

        if (result < 18.5) {
            categoryBMI = "Underweight";
        } else if (result < 24.9) {
            categoryBMI = "Normal Weight";
        } else if (result < 29.9) {
            categoryBMI = "Overweight";
        } else {
            categoryBMI = "Obese";
        }

        System.out.println(categoryBMI); //* output BMI category 
        
    }
}