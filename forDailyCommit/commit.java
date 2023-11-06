package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<String>> groupList = new ArrayList<>();

        ArrayList<String> nameList = new ArrayList<>(); 
        ArrayList<String> colorList = new ArrayList<>(); 
        ArrayList<String> animalList = new ArrayList<>(); 

        inputList(nameList, "name", scan);
        inputList(colorList, "color", scan);
        inputList(animalList, "animal", scan);

        groupList.add(nameList);
        groupList.add(colorList);
        groupList.add(animalList);

        System.out.println(groupList.get(0));
        System.out.println(groupList.get(0).get(0));
        System.out.println();

        for (ArrayList<String> categoryList : groupList) {
            if (categoryList == nameList) {
                System.out.println("\nName List:");
            } else if (categoryList == colorList) {
                System.out.println("\nColor List:");
            } else if (categoryList == animalList) {
                System.out.println("\nAnimal List:");
            }

            for (String list : categoryList) {
                System.out.println(list);
            }
            System.out.println();
        }
    }


    public static void inputList(ArrayList<String> categoryList, String title, Scanner scan) {
        
        while (true) {
            System.out.printf("Enter %s: ", title);
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            categoryList.add(input);
        }
    }
}