/**
 * Sean Connolly
 * CIS 3270
 * Chapter 2
 */
package Chapter2;

import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double bmi = weight * 0.45359237D / Math.pow(height * 0.0254D, 2.0D); //Convert collected weight and height into BMI
        System.out.println("BMI is " + bmi);
    }

}
