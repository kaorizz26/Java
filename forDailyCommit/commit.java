package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Sandra");

        System.out.println(nameList.get(0));
        
        for (String item : nameList) {
            System.out.println(item);
        }
    }
}