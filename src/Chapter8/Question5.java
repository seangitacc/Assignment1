/**
 * Sean Connolly
 * CIS 3270
 * Chapter 8
 */
package Chapter8;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        double[][] matrix1 = getmatrix(1); //Create a new matrix
        double[][] matrix2 = getmatrix(2); //Create another matrix
        double[][] matrix3 = addMatrices(matrix1, matrix2); //Create the resulting matrix

        printMatrix(matrix1, matrix2, matrix3); //Print out each matrix
    }

    /**
     * Collect a 3x3 matrix
     * @param n
     * @return m
     */
    public static double[][] getmatrix(int n) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix" + n + ": ");

        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                m[i][j] = input.nextDouble();
        }

        return m;
    }

    /**
     * Add the matrices together
     * @param a
     * @param b
     * @return c
     */
    public static double[][] addMatrices(double[][] a, double[][] b) {
        double[][] c = new double[3][3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    /**
     * Displays the elements in the specified row
     * @param m
     * @param r
     */
    public static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.print(m[r][j] + " ");
        }
    }

    /**
     * Displays the resulting matrix
     * @param m1
     * @param m2
     * @param m3
     */
    public static void printMatrix(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("The matrices are added as follows: ");

        for (int i = 0; i < 3; i++) {
            print(m1, i);
            System.out.print((i == 1 ? "  +  " : "     "));
            print(m2, i);
            System.out.print((i == 1 ? "  =  " : "     "));
            print(m3, i);
            System.out.println();
        }
    }

}
