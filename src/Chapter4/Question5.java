/**
 * Sean Connolly
 * CIS 3270
 * Chapter 4
 */
package Chapter4;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double numOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = ((numOfSides * (Math.pow(side, 2)))/(4 * Math.tan(Math.PI / numOfSides))); //Calculate the area based on user input
        System.out.println("The area of the polygon is " + area);

    }

}
