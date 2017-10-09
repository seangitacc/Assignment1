/**
 * Sean Connolly
 * CIS 3270
 * Chapter 8
 */
package Chapter8;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");

        //Collect a matrix with a dimension of 3x4
        double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();

        //Print out the sum of the elements in each column
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i +" is " + sumColumn(matrix, i));
        }

    }

    /**
     * Sum each column
     * @param m
     * @param columnIndex
     * @return total
     */
    public static double sumColumn(double[][] m, int columnIndex) {

        double total = 0;

        for (int i = 0; i < m.length; i++) {
            total += m[i][columnIndex];
        }
        return total;
    }

}
