package forDailyCommit;
import java.util.*;

public class commit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<ArrayList<String>> groupList = new ArrayList<>();

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Sandra");

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");

        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("Dog");

        
        
        inputArrayList(nameList, "Name");
        inputArrayList(colorList, "Color");
        inputArrayList(animalList, "Animal");
        
        groupList.add(nameList);
        groupList.add(colorList);
        groupList.add(animalList);

        for (ArrayList<String> categoryList : groupList) {

            if (categoryList == nameList) {
                System.out.println("\nName List: ");
            }
            else if (categoryList == colorList) {
                System.out.println("\nColor List: ");
            }
            else if (categoryList == animalList) {
                System.out.println("\nAnimal List:");
            }

            for (String item : categoryList) {
                System.out.printf("- %s\n", item);
            }
        }
    }

    public static void inputArrayList(ArrayList<String> categoryList, String list) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 'q' to quit");

        while (true) {
            System.out.printf("\nEnter %s List: ", list);
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            categoryList.add(input);
        }
    }
}
