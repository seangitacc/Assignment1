/**
 * Sean Connolly
 * CIS 3270
 * Chapter 7
 */
package Chapter7;

import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int[] numbers = new int[5];

        //Collect 5 numbers
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        System.out.println(gcd(numbers));

    }

    /**
     * Calculate the GCD
     * @param numbers
     * @return gcd
     */
    public static int gcd(int... numbers) {
        int gcd = 1;
        int min = getMin(numbers);
        int length = numbers.length - 1;

        int count = 0;
        for (int i = 2; i <= min; i++) {

            for (int k = 0; k <= length; k++) {
                if (numbers[k] % i == 0) {
                    count++;
                    if (count == length) gcd = i;
                } else {
                    count = 0;
                }
            }
        }

        return gcd;
    }

    /**
     * Calculate the min value
     * @param array
     * @return min
     */
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

}
