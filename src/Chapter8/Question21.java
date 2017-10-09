/**
 * Sean Connolly
 * CIS 3270
 * Chapter 8
 */
package Chapter8;

import java.util.Scanner;

public class Question21 {

    static final int X = 0;
    static final int Y = 1;
    static final int DISTANCE = 2;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numOfCities = input.nextInt();
        double[][] points = new double[numOfCities][3];

        //Collect the coordinates of the cities
        System.out.print("Enter the coordinates of the cities:\n");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length - 1; j++)
                points[i][j] = input.nextDouble();

        //Find the central city
        double[] central = getCentralCity(points);

        System.out.printf("The central city is at (%.1f, %.1f)\n", central[X], central[Y]);
        System.out.printf("The total distance to all other cities is %.2f", central[DISTANCE]);
    }

    /**
     * Compute the distance between the cities
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * Find the central point amongst all cities
     * @param cities
     * @return centralPoint
     */
    public static double[] getCentralCity(double[][] cities) {

        for (int i = 0; i < cities.length; i++) {

            for (int j = 0; j < cities.length; j++) {

                if (j != i) {
                    cities[i][DISTANCE] += distance(cities[i][X], cities[i][Y], cities[j][X], cities[j][Y]);
                }

            }
        }

        double[] centralCity = cities[0];
        for (int i = 1; i < cities.length; i++) {

            if (cities[i][DISTANCE] < centralCity[DISTANCE]) {
                centralCity = cities[i];
            }
        }

        return centralCity;

    }

}
