/**
 * Sean Connolly
 * CIS 3270
 * Chapter 6
 */
package Chapter6;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        System.out.println(sumDigits(number));

    }

    /**
     * Caulate the sum of the digits in a number (e.g., 123 comes to be 1 + 2 + 3 = 6
     * @param n
     * @return sumOfDigits
     */
    public static int sumDigits(long n){
        int sumOfDigits = 0;
        while(n > 0){
            sumOfDigits += n % 10;
            n = n / 10;
        }

        return sumOfDigits;

    }

}
