/**
 * Sean Connolly
 * CIS 3270
 * Chapter 4
 */
package Chapter4;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int userInput = input.nextInt();

        //Ensure user input is valid
        if(!(userInput >= 0 && userInput <= 15)){
            System.out.println(userInput + " is an invalid input!");
            System.exit(0);
        }

        String valueInHex = getHexValue(userInput); //Find the hex value
        System.out.println("The hex value is: " + valueInHex);

    }

    /**
     * Return the hex value for a given number.
     * @param number
     * @return
     */
    public static String getHexValue(int number) {

        if (number <= 9) {
            return Character.toString((char) (number + '0'));
        } else {
            return Character.toString((char) (number - 10 + 'A'));
        }

    }

}
