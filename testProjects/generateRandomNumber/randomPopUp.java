package testProjects.generateRandomNumber;

import javax.swing.JOptionPane;
import java.util.Random;

public class randomPopUp {
    public static void main(String[] args) {

        Random random = new Random();

        int maxNumber, minNumber, result;

        //* Get the maximum and minimum numbers from the user
        maxNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter maximum number:"));
        minNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter minimum number:"));

        //* Check if the input is valid
        if (maxNumber < minNumber) {
            JOptionPane.showMessageDialog(null, "Invalid! Minimum number must be lower.");
            return;
        }

        //* Generate a random number within the specified range and calculate the result
        result = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        //* Display the result to the user
        JOptionPane.showMessageDialog(null, "Result: " + result);

        //* Ask the user if they want to continue
        String choice = JOptionPane.showInputDialog("Do you want to continue (Y/N):");
        choice = choice.toLowerCase();

        //* Check user's choice and either restart the program or say goodbye
        if (choice.equals("y")) {
            main(args); //* Restart the program
        } else {
            JOptionPane.showMessageDialog(null, "Goodbye!"); //* End the program
        }
    }
}
