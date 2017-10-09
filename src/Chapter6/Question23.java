/**
 * Sean Connolly
 * CIS 3270
 * Chapter 6
 */
package Chapter6;

import java.util.Scanner;

public class Question23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        Character c = input.nextLine().charAt(0);

        System.out.println(count(str, c));

    }

    /**
     * Calculate the number of occurrences of the specified character in the string
     * @param str
     * @param a
     * @return count
     */
    public static int count(String str, char a){

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a){
                count++;
            }
        }

        return count;
    }

}
