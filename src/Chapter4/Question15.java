/**
 * Sean Connolly
 * CIS 3270
 * Chapter 4
 */
package Chapter4;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char userInput = input.nextLine().charAt(0);

        //Ensure user input is valid
        if(!(userInput >= 'A' && userInput <= 'z')){
            System.out.println(userInput + " is an invalid input!");
            System.exit(0);
        }

        char inputUpper = Character.toUpperCase(userInput);

        int convertedNum = 0;

        //Convert the letter based on the number it would stand for on a phone's keypad
        switch(inputUpper){
            case 'A':
            case 'B':
            case 'C':
                convertedNum = 2; break;
            case 'D':
            case 'E':
            case 'F':
                convertedNum = 3; break;
            case 'G':
            case 'H':
            case 'I':
                convertedNum = 4; break;
            case 'J':
            case 'K':
            case 'L':
                convertedNum = 5; break;
            case 'M':
            case 'N':
            case 'O':
                convertedNum = 6; break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                convertedNum = 7; break;
            case 'T':
            case 'U':
            case 'V':
                convertedNum = 8; break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                convertedNum = 9; break;
        }

        System.out.println("The corresponding number is " + convertedNum); //Print the resulting number

    }

}
