/**
 * Sean Connolly
 * CIS 3270
 * Chapter 7
 */
package Chapter7;

public class Question22 {

    static final int QUEEN = 100;


    static final int X_LIMIT = 8;
    static final int Y_LIMIT = 8;
    static long TIME_LIMIT = 25; // milliseconds
    static int UP_LEFT = 0; // DEBUGGING
    static int UP_RIGTH = 0;
    static int DOWN_LEFT = 0;
    static int DOWN_RIGHT = 0;

    public static void main(String[] args) {

        displayTimesTable(X_LIMIT , Y_LIMIT);
        System.out.println("\n\n");


        int[][] grid = new int[X_LIMIT][X_LIMIT];

        int queenCount = 0;
        long startTime = System.currentTimeMillis();
        while (queenCount < 8) {


            int x = getPosition();
            int y = getPosition();

            if (isLocationSafe(grid, x, y)) {
                grid[x][y] = QUEEN;
                queenCount++;
            }
            long timeCheck = System.currentTimeMillis();
            if (timeCheck - startTime > TIME_LIMIT) {
                clearGrid(grid);
                queenCount = 0;
                startTime = System.currentTimeMillis();
            }


        }


        displayGrid(grid);

    }

    /**
     * Return whether the entire location is safe
     * @param grid
     * @param x
     * @param y
     * @return true or false
     */
    public static boolean isLocationSafe(int[][] grid, int x, int y) {
        return (isDiagonalSafe(grid, x, y) &&
                isColumnSafe(grid, x, y) &&
                isRowSafe(grid, x, y));
    }

    /**
     * Check whether or not the diagonal directions are safe
     * @param grid
     * @param x
     * @param y
     * @return true or false
     */
    public static boolean isDiagonalSafe(int[][] grid, int x, int y) {

        int x1 = x;
        int y1 = y;

        while (x1 >= 0 && y1 >= 0) {

            if (grid[x1][y1] == QUEEN) return false;
            UP_LEFT++;
            x1--;
            y1--;

        }

        x1 = x;
        y1 = y;

        while ( x1 >= 0 && y1 <= 7) {

            if (grid[x1][y1] == QUEEN) return false;
            DOWN_LEFT++;
            x1--;
            y1++;


        }

        x1 = x;
        y1 = y;

        while (x1 <= 7 && y1 >= 0) {

            if (grid[x1][y1] == QUEEN) return false;

            UP_RIGTH++;
            x1++;
            y1--;


        }

        x1 = x;
        y1 = y;

        while (x1 <= 7 && y1 <= 7) {

            if (grid[x1][y1] == QUEEN) return false;
            DOWN_RIGHT++;
            x1++;
            y1++;

        }



        return true;
    }

    /**
     * Check whether a column is safe
     * @param grid
     * @param x
     * @param y
     * @return true or false
     */
    public static boolean isColumnSafe(int[][] grid, int x, int y) {

        for (int i = 0; i < Y_LIMIT; i++) {
            if (grid[x][i] == QUEEN) return false;
        }

        return true;
    }

    /**
     * Check whether a row is safe
     * @param grid
     * @param x
     * @param y
     * @return true or false
     */
    public static boolean isRowSafe(int[][] grid, int x, int y) {

        for (int i = 0; i < X_LIMIT; i++) {
            if (grid[i][y] == QUEEN) return false;
        }


        return true;
    }

    /**
     * Display the grid
     * @param grid
     */
    public static void displayGrid(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {

            System.out.printf("%20s|", "");
            for (int k = 0; k < grid[i].length; k++) {
                System.out.printf("%-1c|", (grid[i][k] == 100) ? 'Q' : ' ');
            }
            System.out.println("");
        }

    }

    /**
     * Generate a position for the queen
     * @return the position
     */
    public static int getPosition() {
        return (int) (Math.random() * 8);
    }

    /**
     * Display the times table
     * @param x
     * @param y
     */
    public static void displayTimesTable(int x, int y) {
        // display 8x8 numbered grid to help solve exercise
        for (int i = 1; i <= y; i++) {

            System.out.printf("%20s", "");
            for (int k = 1; k <= x; k++) {
                System.out.printf("|%-2d|", i * k);
            }
            System.out.println("");
        }
    }

    /**
     * Display an 8x8 grid
     * @param x
     * @param y
     */
    public static void displayPlainTable(int x, int y) {
        for (int i = 0; i < y; i++) {

            System.out.printf("%20s", "");
            for (int k = 0; k < x; k++) {
                System.out.printf("(%1d,%1d)", k, i);
            }
            System.out.println("");
        }
    }

    /**
     * Clear the grid
     * @param grid
     */
    public static void clearGrid(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {

            for (int k = 0; k < grid[i].length; k++) {
                grid[k][i] = 0;
            }
        }


    }

}
