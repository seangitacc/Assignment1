/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numOfLines = input.nextInt();

        //Ensure input is valid
        while(numOfLines < 1 || numOfLines > 15){
            System.out.print("\nInvalid input! Try again: ");
            numOfLines = input.nextInt();
        }

        //Print out the pyramid
        for (int rows = 1; rows <= numOfLines; rows++) {
            for (int s = numOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }

    }

}
