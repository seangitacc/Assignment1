/**
 * Sean Connolly
 * CIS 3270
 * Chapter 8
 */
package Chapter8;

import java.util.Scanner;

public class Question37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        //Ask user a question
        for (int i = 0; i < stateCapitals.length; i++) {
            System.out.print("What is the capital of " + stateCapitals[i][0]+"? ");
            String s = input.nextLine();
            //Check if right or wrong
            if (s.equalsIgnoreCase(stateCapitals[i][1])) {
                System.out.println("Your answer is correct!");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + stateCapitals[i][1] + ".");
            }
        }
        System.out.println("The correct count is " + correctCount + ".");
    }

    //Collection of all the states and their capitals
    private static String[][] stateCapitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Maryland", "Annapolis"},
            {"Minnesota", "Saint Paul"},
            {"Iowa", "Des Moines"},
            {"Maine", "Augusta"},
            {"Kentucky", "Frankfort"},
            {"Indiana", "Indianapolis"},
            {"Kansas", "Topeka"},
            {"Louisiana", "Baton Rouge"},
            {"Oregon", "Salem"},
            {"Oklahoma", "Oklahoma City"},
            {"Ohio", "Columbus"},
            {"North Dakota", "Bismark"},
            {"New York", "Albany"},
            {"New Mexico", "Santa Fe"},
            {"New Jersey", "Trenton"},
            {"New Hampshire", "Concord"},
            {"Nevada", "Carson City"},
            {"Nebraska", "Lincoln"},
            {"Montana", "Helena"},
            {"North Carolina", "Raleigh"},
            {"Missouri", "Jefferson City"},
            {"Mississippi", "Jackson"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
    };

}
