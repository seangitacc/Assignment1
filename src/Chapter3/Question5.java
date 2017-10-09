/**
 * Sean Connolly
 * CIS 3270
 * Chapter 3
 */
package Chapter3;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        System.out.print("Enter the number of day elapsed since today: ");
        int elapsed = input.nextInt();

        //Find what day today is
        String day = null;
        switch(today){
            case 0: day = "Sunday"; break;
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
        }

        int calculated = (today + elapsed) % 7; //Calculate the day based on the elapsed number of days

        //Find the day based on the calculated value
        String day2 = null;
        switch(calculated){
            case 0: day2 = "Sunday"; break;
            case 1: day2 = "Monday"; break;
            case 2: day2 = "Tuesday"; break;
            case 3: day2 = "Wednesday"; break;
            case 4: day2 = "Thursday"; break;
            case 5: day2 = "Friday"; break;
            case 6: day2 = "Saturday"; break;
        }

        System.out.println("Today is " + day + " and the future day is " + day2);

    }
}
