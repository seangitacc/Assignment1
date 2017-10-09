/**
 * Sean Connolly
 * CIS 3270
 * Chapter 2
 */
package Chapter2;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Please enter the gratuity rate: ");
        double gratuity = input.nextDouble();
        System.out.println("The gratuity is $" + subtotal * (gratuity / 100.0D) + " and the total is $" + (subtotal + subtotal * (gratuity / 100.0D))); //Calculate the tip and total
    }
}
