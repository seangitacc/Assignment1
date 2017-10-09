/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

import java.util.Scanner;

public class Question51 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();


        int count = 0;
        String sameName = "";
        //Find the commong prefixes in both statements
        while(firstString.charAt(count) == secondString.charAt(count)) {
            sameName += firstString.charAt(count);
            count++;
        }

        if(sameName == ""){
            System.out.println(firstString + " and  " + secondString + " have no common prefix.");
        }else{
            System.out.println("The common prefix is " + sameName);
        }

    }

}
