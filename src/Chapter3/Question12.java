/**
 * Sean Connolly
 * CIS 3270
 * Chapter 3
 */
package Chapter3;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int userNumber = input.nextInt();

        //Find whether the collected number is a palindrome (e.g., 121 is 121 backwards)
        if(userNumber % 10 == userNumber / 100){
            System.out.println(userNumber + " is a palindrome");
        }else{
            System.out.println(userNumber + " is not a palindrome");
        }

    }

}
