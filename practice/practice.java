package code.practice;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int a, b, result;

        System.out.printf("Enter a: ");
        a = scan.nextInt();

        System.out.printf("Enter b: ");
        b = scan.nextInt();

        result = a + b;
        System.out.printf("%d + %d is equal to: %d\n", a, b, result);

        scan.close();
    }
}
