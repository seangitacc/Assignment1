/**
 * Sean Connolly
 * CIS 3270
 * Chapter 7
 */
package Chapter7;

public class Question7 {

    public static void main(String[] args) {

        int[] counts = new int[10];

        //Calculate the count for 0 - 9, inclusive
        for(int i = 1; i <= 100; i++){
            counts[(int)(Math.random() * 10)]++;
        }

        System.out.println("Count for 0 - 9 are: ");
        for(int i = 0; i < counts.length; i++){
            System.out.println(i + "s: " + counts[i]);
        }

    }

}
