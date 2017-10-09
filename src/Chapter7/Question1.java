/**
 * Sean Connolly
 * CIS 3270
 * Chapter 7
 */
package Chapter7;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int count = input.nextInt();

        //Collect the scores
        System.out.print("Enter " + count + " scores: ");
        int[] scores = new int[count];
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
        }

        char[] grades = gradeScores(scores);

        for(int i = 0; i < grades.length; i++){
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
        }

    }

    /**
     * Grade the scores
     * @param scores
     * @return gradedScores
     */
    public static char[] gradeScores(int[] scores){
        char[] gradedScores = new char[scores.length];
        int best = scores[0];
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > best){
                best = scores[i];
            }
        }

        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= best - 10){
                gradedScores[i] = 'A';
            }else if(scores[i] >= best - 20) {
                gradedScores[i] = 'B';
            }else if(scores[i] >= best - 30) {
                gradedScores[i] = 'C';
            }else if(scores[i] >= best - 40) {
                gradedScores[i] = 'D';
            }else{
                gradedScores[i] = 'F';
            }
        }

        return gradedScores;
    }

}
