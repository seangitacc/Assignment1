/**
 * Sean Connolly
 * CIS 3270
 * Chapter 2
 */
package Chapter2;

import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0D); //Calculate area from collected information
        System.out.println("The area of the traingle is " + area);
    }

}
