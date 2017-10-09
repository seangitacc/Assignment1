/**
 * Sean Connolly
 * CIS 3270
 * Chapter 8
 */
package Chapter8;

public class Question10 {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        //Use Math.random() to fill with 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        //Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("The largest row index: " + largestRow(matrix));
        System.out.println("The largest row column: " + largestColumn(matrix));
    }

    /**
     * Calculate the largest row
     * @param matrix
     * @return maxRow
     */
    public static int largestRow(int[][] matrix) {
        int maxRow = 0;
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRow = i;
            }
        }
        return maxRow;
    }

    /**
     * Calculate the largest column
     * @param matrix
     * @return maxColumn
     */
    public static int largestColumn(int[][] matrix) {
        int maxColumn = 0;
        int max = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            int count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxColumn = col;
            }
        }
        return maxColumn;
    }

}
