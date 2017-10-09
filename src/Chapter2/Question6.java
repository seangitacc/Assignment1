/**
 * Sean Connolly
 * CIS 3270
 * Chapter 2
 */
package Chapter2;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sum = number % 10 + number / 10 % 10 + number / 100 % 10; //Sum up all of the digits in the integer
        System.out.println("The sum of the digits is: " + sum);
    }

}
