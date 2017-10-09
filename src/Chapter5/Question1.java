/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int userNumber = input.nextInt();
        int positiveNums = 0;
        int negativeNums = 0;
        double sum = 0;
        double count = 0;

        //Exit the program if zero
        if(userNumber == 0){
            System.exit(0);
        }

        //Count the number of positives, negatives, and sum
        while(userNumber != 0){
            if(userNumber > 0){
                sum += userNumber;
                positiveNums++;
            }else{
                sum += userNumber;
                negativeNums++;
            }

            count++;
            userNumber = input.nextInt();
        }

        //Print out positives, negatives, sum, and average
        System.out.println("The number of positives is " + positiveNums);
        System.out.println("The number of negatives is " + negativeNums);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + (sum/count));

    }

}
