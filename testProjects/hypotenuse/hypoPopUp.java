package testProjects.hypotenuse;

//* Import the JOptionPane class for user input and output
import javax.swing.JOptionPane;

//* Define the main class
public class hypoPopUp {
    public static void main(String[] args) {
        //* Declare variables for sides x, y, and hypotenuse z
        double x, y, z;

        //* Get the value of side x from user input using JOptionPane
        x = Double.parseDouble(JOptionPane.showInputDialog("Side x: "));

        //* Get the value of side y from user input using JOptionPane
        y = Double.parseDouble(JOptionPane.showInputDialog("Side y: "));

        //* Calculate the hypotenuse using the Pythagorean theorem
        z = Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));

        //* Display the calculated hypotenuse using JOptionPane
        JOptionPane.showMessageDialog(null, "The hypotenuse is: " + z);
    }
}
