/**
 * Sean Connolly
 * CIS 3270
 * Chapter 3
 */
package Chapter3;

import java.util.Scanner;

public class Question28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");

        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1width = input.nextDouble();
        double r1height = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");

        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2width = input.nextDouble();
        double r2height = input.nextDouble();

        //Calculate the x distance
        double xDist = r1x >= r2x ? r1x - r2x : r2x - r1x;

        //Calculate the y distance
        double yDist = r1y >= r2y ? r1y - r2y : r2y - r1y;

        boolean r2IsInsideR1 = (xDist <= (r1width - r2width) / 2 && yDist <= (r1height - r2height) / 2); //Check whether r2 is inside r1
        boolean r2OverlapsR1 = (xDist <= (r1width + r2width) / 2 && yDist <= (r1height + r2height) / 2); //Check whether r2 overlaps r1

        if (r2IsInsideR1) {
            System.out.println("r2 is inside r1");
        } else if (r2OverlapsR1) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }

    }

}
