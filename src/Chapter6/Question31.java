/**
 * Sean Connolly
 * CIS 3270
 * Chapter 6
 */
package Chapter6;

import java.util.Scanner;

public class Question31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        System.out.println(
                number + " is " + (isValid(number) ? "valid" : "invalid"));
    }

    /**
     * Check whether the number is valid
     * @param number
     * @return valid
     */
    public static boolean isValid(long number) {
        boolean valid =
                (getSize(number) >= 13 && getSize(number) <= 16) &&
                        (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                                prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                        ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

        return valid;
    }

    /**
     * Calculare the sum of the two numbers
     * @param number
     * @return sum
     */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    /**
     * If it is not a double digit sum, return this number
     * @param number
     * @return number
     */
    public static int getDigit(int number) {
        if (number < 9)
            return number;
        else
            return number / 10 + number % 10;
    }

    /**
     * Return sum of odd-place digits in number
     * @param number
     * @return sum
     */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    /**
     * Return true if the digit d is a prefix for number
     * @param number
     * @param d
     * @return true or false
     */
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    /**
     * Return the number of digits in d
     * @param d
     * @return num.length()
     */
    public static int getSize(long d) {
        String num = d + "";
        return num.length();
    }

    /**
     * Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     * @param number
     * @param k
     * @return number
     */
    public static long getPrefix(long number, int k) {
        if (getSize(number) > k)  {
            String num = number + "";
            return  Long.parseLong(num.substring(0, k));
        }
        return number;
    }
}
