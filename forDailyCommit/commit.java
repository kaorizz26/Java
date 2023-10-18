package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String[][] foodsArray = {
            {"Pork", "Adobo", "Chicken"},
            {"Pizza", "Lollipop", "Barbeque"},
            {"Apple", "Kimchi", "Mojos"}
        };

        for (int i = 0; i < foodsArray.length; i++) {
            for (int j = 0; j < foodsArray[i].length; j++) {
                System.out.print(foodsArray[i][j] + "    \t");
            }
            System.out.println();
        }
    }
}
