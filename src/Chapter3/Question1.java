/**
 * Sean Connolly
 * CIS 3270
 * Chapter 3
 */
package Chapter3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (b * b) - (4 * a * c); //Calculate the discriminant

        double root;
        double root2;

        if (discriminant > 0) { //If it is greater than zero, calculate two roots
            root = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots " + root + " and " + root2);
        } else if (discriminant == 0) { //If it is equal to zero, calculate one root
            root = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has one root " + root);
        } else if (discriminant < 0) { //If it is less than zero, it has no roots
            System.out.println("The equation has no real roots.");
        }

    }
}
