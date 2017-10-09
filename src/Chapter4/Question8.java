/**
 * Sean Connolly
 * CIS 3270
 * Chapter 4
 */
package Chapter4;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ACII2 code: ");
        int userInput = input.nextInt();

        //Only collect ASCII characters from 1 - 126
        if(!(userInput > 0 && userInput < 127)){
            System.out.println("Invalid input!");
            System.exit(0);
        }

        System.out.println("The character for ACSII code " + userInput + " is " + (char) userInput); //Print out the ASCII character

    }

}
