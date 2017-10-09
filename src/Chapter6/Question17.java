/**
 * Sean Connolly
 * CIS 3270
 * Chapter 6
 */
package Chapter6;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);

    }

    /**
     * Print the matrix based on the size given by the user
     * @param n
     */
    public static void printMatrix(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }

    }

}
