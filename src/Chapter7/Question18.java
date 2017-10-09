/**
 * Sean Connolly
 * CIS 3270
 * Chapter 7
 */
package Chapter7;

import java.util.Scanner;

public class Question18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter ten numbers: ");
        double[] numbers = new double[10];

        //Collect the user input
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        bubbleSort(numbers);
        print(numbers);
    }

    /**
     * Print the array
     * @param numbers
     */
    public static void print(double[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    /**
     * Bubble sore the array
     * @param numbers
     */
    public static void bubbleSort(double[] numbers) {

        boolean change;
        do {
            change = false;
            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    change = true;
                }
            }

        } while (change);

    }

}
