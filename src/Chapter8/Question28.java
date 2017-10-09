/**
 * Sean Connolly
 * CIS 3270
 * Chapter 8
 */
package Chapter8;

import java.util.Scanner;

public class Question28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Collect list1
        System.out.print("Enter list1: ");
        int[][] list1 = new int[3][3];
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list1[i][j] = input.nextInt();
            }
        }

        //Collect list2
        System.out.print("Enter list2: ");
        int[][] list2 = new int[3][3];
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                list2[i][j] = input.nextInt();
            }
        }

        //Check to see if they are equal
        if(equals(list1, list2)){
            System.out.println("The two arrays are strictly identical.");
        }else{
            System.out.println("The two arrays are not strictly identical.");
        }
    }

    /**
     * Check if each element is the same
     * @param m1
     * @param m2
     * @return true or false
     */
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j])
                    return false;
            }
        }
        return true;
    }

}
