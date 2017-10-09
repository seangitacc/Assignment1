/**
 * Sean Connolly
 * CIS 3270
 * Chapter 7
 */
package Chapter7;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10];
        int num;
        int count = 0;

        //Collect ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            //Is the number a distinct number?
            if (isDistinct(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are");
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] > 0)
                System.out.print(" " + distinctNumbers[i]);
        }
        System.out.println();
    }

    /**
     * Check whether the number is in the array already
     * @param array
     * @param num
     * @return true or false
     */
    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }

}
