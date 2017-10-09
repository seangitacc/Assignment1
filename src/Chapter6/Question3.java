/**
 * Sean Connolly
 * CIS 3270
 * Chapter 6
 */
package Chapter6;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println(isPalindrome(number));

    }

    /**
     * Reverse the number
     * @param number
     * @return revNum
     */
    public static int reverse(int number){
        String revNum = "";
        String covNum = number + "";
        for(int i = covNum.length() - 1; i >= 0; i--){
            revNum += covNum.charAt(i);
        }

        return Integer.parseInt(revNum);
    }

    /**
     * Check to see if the reverse of the number indicates it is a palindrome
     * @param number
     * @return isSame
     */
    public static boolean isPalindrome(int number){
       boolean isSame = false;

       if(number == reverse(number)){
           isSame = true;
       }

       return isSame;
    }

}
