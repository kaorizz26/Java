package practice;
import java.util.Random;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter minimum number: ");
        int min = scan.nextInt();

        System.out.printf("Enter maximum number: ");
        int max = scan.nextInt();

        if (max < min) {
            System.out.println("Max number should be less than min.");
        }

        int result = random.nextInt(max - min + 1) + min;

        System.out.println(result);
    }
}