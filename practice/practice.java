package practice;
import java.util.Random;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter number 1: ");
        int n1 = scan.nextInt();

        System.out.printf("Enter number 2: ");
        int n2 = scan.nextInt();

        System.out.printf("Enter number 3: ");
        int n3 = scan.nextInt();

        if (n1 <= n2 && n2 <= n3) {
            System.out.printf("%d %d %d\n", n1, n2, n3);
        }
        else if (n1 <= n3 && n3 <= n2) {
            System.out.printf("%d %d %d\n", n1, n3, n2);
        }
        else if (n2 <= n1 && n1 <= n3) {
            System.out.printf("%d %d %d\n", n2, n1, n3);
        }        
        else if (n2 <= n3 && n3 <= n1) {
            System.out.printf("%d %d %d\n", n2, n3, n1);
        }
        else if (n3 <= n1 && n1 <= n2) {
            System.out.printf("%d %d %d\n", n3, n1, n2);
        }
        else {
            System.out.printf("%d %d %d\n", n3, n2, n1);
        }
    }
}