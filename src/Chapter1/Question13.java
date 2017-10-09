/**
 * Sean Connolly
 * CIS 3270
 * Chapter 1
 */
package Chapter1;

public class Question13 {

    public static void main(String[] args) {
        double a = 3.4D;
        double b = 50.2D;
        double e = 44.5D;
        double c = 2.1D;
        double d = 0.55D;
        double f = 5.9D;
        double x = (e * d - b * f) / (a * d - b * c); //Solve for the x value
        double y = (a * f - e * c) / (a * d - b * c); //Solve for the y value
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
    }

}
