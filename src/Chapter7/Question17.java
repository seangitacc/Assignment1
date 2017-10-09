/**
 * Sean Connolly
 * CIS 3270
 * Chapter 7
 */
package Chapter7;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];

        //Collect the student's name and score
        for(int i = 0; i < students.length; i++){
            System.out.print("Enter " + i + "'s name: ");
            students[i] = input.next();
            System.out.print("Enter " + students[i] + "'s score: ");
            scores[i] = input.nextInt();
        }

        //Sort the numbers in decreasing order
        sortDecreasing(students, scores);

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

    }

    /**
     * Sore the grades in decreasing order
     * @param strs
     * @param nums
     */
    public static void sortDecreasing(String[] strs, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int maxIndex = i;
            String temp;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                temp = strs[i];
                strs[i] = strs[maxIndex];
                strs[maxIndex] = temp;
                nums[maxIndex] = nums[i];
                nums[i] = max;
            }
        }
    }

}
