package testProjects.gradesCalculator;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //* Prompt user for the number of grades to compute
        System.out.print("Enter how many grades you want to compute: ");
        int scoreLength = scan.nextInt();

        //* Create an array to store grades
        int[] scoreArray = new int[scoreLength];

        //* Input grades and ensure they are non-negative
        for (int i = 0; i < scoreLength; i++) {
            System.out.printf("Grade %d: ", i + 1);
            int grade = scan.nextInt();

            if (grade >= 0) {
                scoreArray[i] = grade;
            } else {
                System.out.println("Negative number is not allowed.");
                i--; //* Retry input
            }
        }

        //* Calculate the sum of grades
        int sum = 0;
        for (int i = 0; i < scoreLength; i++) {
            sum += scoreArray[i];
        }

        //* Calculate and display the average grade
        float average = (float) sum / scoreLength;
        System.out.printf("Average: %.2f\n", average);
    }
}

