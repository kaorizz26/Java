package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter num a: ");
        int a = scan.nextInt();

        System.out.print("Enter num b: ");
        int b = scan.nextInt();

        int z = add(a, b);
        System.out.printf("The sum is: %d\n", z);
    }

    public static int add(int a, int b) {
        int z = a + b;
        return z;
    }
}
