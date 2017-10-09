/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

import java.util.Scanner;

public class Question45 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        double sum = 0;
        double deviation = 0;

        //Collect the numbers, their sum, and the deviation
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
            deviation += (Math.pow(numbers[i], 2));
        }

        deviation = Math.sqrt((deviation - (Math.pow(sum, 2) / 10)) / (10 - 1)); //Calculate the standard deviation

        System.out.println("The mean is: " + (sum / 10));
        System.out.printf("The standard deviation is %.5f\n", deviation);


    }

}
