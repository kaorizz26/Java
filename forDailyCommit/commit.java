package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        ArrayList<String> foods = new ArrayList<>();

        foods.add("orange");
        foods.add("apple");
        foods.add("pineapple");

        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }
    }
}
