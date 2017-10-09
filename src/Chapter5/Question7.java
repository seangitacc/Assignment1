/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a tuition: ");
        int tuition = input.nextInt();

        //Calculate tuition after 10 years
        for(int i = 0; i <= 10; i++){
            tuition += (tuition * .05);
        }

        System.out.println("The tuition when you start college is is: " + tuition);

        //Calculate the total tuition paid after 4 more years
        int sum = 0;
        for(int i = 1; i <= 4; i++){
            tuition += (tuition * .05);
            sum += tuition;
        }

        System.out.println("You will pay " + sum + " over four years.");
    }
}
