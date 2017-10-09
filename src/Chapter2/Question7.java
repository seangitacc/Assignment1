/**
 * Sean Connolly
 * CIS 3270
 * Chapter 2
 */
package Chapter2;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int hours = minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        days %= 365;
        System.out.println(minutes + " minutes is approx. " + years + " years " + "and " + days + " days."); //Convert minutes into years and days
    }

}
