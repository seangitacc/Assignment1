/**
 * Sean Connolly
 * CIS 3270
 * Chapter 7
 */
package Chapter7;

import java.util.Scanner;

public class Question33 {

    public static void main(String[] args) {

        String[] zodiacSigns = new String[] {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.println(zodiacSigns[year % 12]); //Print out the correct zodiac sign for the current year
    }

}
