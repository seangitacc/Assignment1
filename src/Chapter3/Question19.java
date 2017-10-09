/**
 * Sean Connolly
 * CIS 3270
 * Chapter 3
 */
package Chapter3;

import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter three sides: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        //Input is only valid if the collection of two sides is always greater than the remaining side
        if((side1 + side2 >= side3) && (side2 + side3 >= side1) && (side3 + side1 >= side2)){
            System.out.print("The perimeter is: " + (side1 + side2 + side3));
        }else{
            System.out.print("Your input is invalid.");
        }

    }

}
