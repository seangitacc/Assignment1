/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of students: ");
        int numOfStudents = input.nextInt();
        String[] studentNames = new String[numOfStudents];
        double[] studentScores = new double[numOfStudents];

        //Collect the student's name
        for(int i = 0; i < numOfStudents; i++){
            System.out.print("Enter the student's name: ");
            studentNames[i] = input.next();
        }

        //Collect the student's score
        for(int i = 0; i < numOfStudents; i++){
            System.out.print("Enter the student's score: ");
            studentScores[i] = input.nextDouble();
        }

        double highestScore = 0;
        String highestStudent = null;
        double secondHighest = 0;
        String secondHighestStu = null;

        //Find the highest score and the second highest score
        for(int i = 0; i < studentScores.length; i++){
            if(studentScores[i] > highestScore){
                highestScore = studentScores[i];
                highestStudent = studentNames[i];
            }else if(studentScores[i] > secondHighest){
                secondHighest = studentScores[i];
                secondHighestStu = studentNames[i];
            }
        }

        System.out.println("The highest score is " + highestScore + " and the student is " + highestStudent);
        System.out.println("The second highest score is " + secondHighest + " and the student is " + secondHighestStu);


    }

}
