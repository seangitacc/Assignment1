/**
 * Sean Connolly
 * CIS 3270
 * Chapter 4
 */
package Chapter4;

public class Question3 {

    private static final double AVERAGE_EARTH_RADIUS = 6371.01;

    public static void main(String[] args) {

        double atlantaGeoY = -84.3879824;
        double atlantaGeoX = 33.7489954;

        double orlandoFLY = -81.3792364999;
        double orlandoFLX = 28.5383355;

        double SavannahGeoY = -81.09983419999998;
        double SavannahGeoX = 32.0835407;

        double charlotteNCY = -80.84312669999997;
        double charlotteNCX = 35.2270869;

        //Divide up the points to create two triangles and calculate the distance between each point
        double t1Side1 = distanceBetweenTwoPointsGEOGRAPH(atlantaGeoX, atlantaGeoY, SavannahGeoX, SavannahGeoY);
        double t1Side2 = distanceBetweenTwoPointsGEOGRAPH(SavannahGeoX, SavannahGeoY, charlotteNCX, charlotteNCY);
        double t1Side3 = distanceBetweenTwoPointsGEOGRAPH(charlotteNCX, charlotteNCY, atlantaGeoX, atlantaGeoY);

        double t2Side1 = distanceBetweenTwoPointsGEOGRAPH(atlantaGeoX, atlantaGeoY, orlandoFLX, orlandoFLY);
        double t2Side2 = distanceBetweenTwoPointsGEOGRAPH(orlandoFLX, orlandoFLY, SavannahGeoX, SavannahGeoY);
        double t2Side3 = distanceBetweenTwoPointsGEOGRAPH(SavannahGeoX, SavannahGeoY, atlantaGeoX, atlantaGeoY);

        //Make sure both triangle's are valid triangles
        boolean isTriangle1 = isTriangle(t1Side1, t1Side2, t1Side3);
        boolean isTriangle2 = isTriangle(t1Side1, t1Side2, t1Side3);


        //If both triangles are valid triangles, print ou the areas
        if (isTriangle1 && isTriangle2) {
            double area1 = getTriangleArea(t1Side1, t1Side2, t1Side3);
            double area2 = getTriangleArea(t2Side1, t2Side2, t2Side3);
            System.out.printf("Triangle 1: %f -- %f -- %f   : area = %f\n", t1Side1, t1Side2, t1Side3, area1);
            System.out.printf("Triangle 2: %f -- %f -- %f   : area = %f\n", t2Side1, t2Side2, t2Side3, area2);
            double totalArea = area1 + area2;
            System.out.println("The area of the triangle is " + totalArea);
        } else {
            System.out.println("Sorry the coordinates are incorrect");
        }

    }

    /**
     * Calculate the distance between the two points.
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return distance
     */
    public static double distanceBetweenTwoPointsGEOGRAPH(double x1, double y1, double x2, double y2) {

        double distance = AVERAGE_EARTH_RADIUS *
                Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

        return distance;
    }

    /**
     * Calculate triangle's area.
     * @param side1
     * @param side2
     * @param side3
     * @return
     */
    public static double getTriangleArea(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    /**
     * Ensure the input is a valid triangle.
     * @param side1
     * @param side2
     * @param side3
     * @return
     */
    public static boolean isTriangle(double side1, double side2, double side3) {

        return  ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side3 + side2 > side1));

    }

}
