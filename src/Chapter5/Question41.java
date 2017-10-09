/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

import java.util.Scanner;

public class Question41 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int max = input.nextInt();
        int count = 1;
        int number = 1;

        //Check which number is the largest and keep a count of it
        while (number != 0){
            number = input.nextInt();
            if(number > max){
                max = number;
                count = 1;
            }else if(number == max){
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

    }

}
