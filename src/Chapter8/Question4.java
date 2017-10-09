/**
 * Sean Connolly
 * CIS 3270
 * Chapter 8
 */
package Chapter8;

public class Question4 {

    static final int EMP = 0;
    static final int HOURS = 1;

    public static void main(String[] args) {

        //Matrix of employee hours
        int[][] employeeHours = new int[][] {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};


        //Calculate the total hours for the matrix
        int[][] totalChart = calcHours(employeeHours);

        //Sort the hours chart
        descendingSort(totalChart);

        //Print out the hours chart
        for (int i = 0; i < totalChart.length; i++) {
            System.out.println("Employee #"+ totalChart[i][EMP] + " total hours = " +
                    totalChart[i][HOURS]);
        }

    }

    /**
     * Calculate the total hours for the chart
     * @param m
     * @return totalChart
     */
    public static int[][] calcHours(int[][] m) {

        int[][] totalChart = new int[m.length][2];

        for (int i = 0; i < m.length; i++) {
            totalChart[i][HOURS] = getRowTotalHour(m, i);
            totalChart[i][EMP] = i;
        }


        return totalChart;
    }

    /**
     * Calculate the total hours for the employee
     * @param m
     * @param row
     * @return total
     */
    public static int getRowTotalHour(int[][] m, int row) {

        int total = 0;
        for (int column = 0; column < m[row].length; column++) {
            total += m[row][column];
        }
        return total;
    }

    /**
     * Sore the matrix in descending order
     * @param m
     */
    public static void descendingSort(int[][] m) {

        for (int i = 0; i < m.length - 1; i++) {

            int currentIndex = i;
            int currentMax = m[i][HOURS];
            int empNum = m[i][EMP];
            for (int k = i + 1; k < m.length; k++) {

                if (currentMax < m[k][HOURS]) {
                    currentMax = m[k][HOURS];
                    currentIndex = k;
                    empNum = m[k][EMP];
                }
            }

            if (currentIndex != i) {
                m[currentIndex][EMP] = m[i][EMP];
                m[currentIndex][HOURS] = m[i][HOURS];
                m[i][EMP] = empNum;
                m[i][HOURS] = currentMax;
            }

        }
    }

}
