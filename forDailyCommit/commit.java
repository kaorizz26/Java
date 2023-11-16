package forDailyCommit;

import java.util.ArrayList;
import java.util.Scanner;

public class commit {

    static ArrayList<ArrayList<String>> groupList = new ArrayList<>();

    static ArrayList<String> nameList = new ArrayList<>();
    static ArrayList<String> colorList = new ArrayList<>();
    static ArrayList<String> animalList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        inputArrayList(scan, nameList, "name");
        inputArrayList(scan, colorList, "color");
        inputArrayList(scan, animalList, "animal");

        groupList.add(nameList);
        groupList.add(colorList);
        groupList.add(animalList);

        displayList();

    }


    public static void inputArrayList(Scanner scan, ArrayList<String> list, String word) {
        
        while (true) {
            
            System.out.println("\nEnter 'q' to quit");
            System.out.printf("Enter %s: ", word);
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("q")) {
                return;
            }

            list.add(input);
        }
    }

    public static void displayList() {

        for (ArrayList<String> lists : groupList) {

            if (lists == nameList) {
                System.out.println("\nName List:");
            } else if (lists == animalList) {
                System.out.println("\nAnimal List: ");
            } else if (lists == colorList) {
                System.out.println("\nColor list: ");
            }

            for (String list : lists) {
                System.out.printf("- %s\n", list);
            }
        }
    }
    
}
