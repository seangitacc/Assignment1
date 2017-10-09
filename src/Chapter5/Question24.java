/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

public class Question24 {

    public static void main(String[] args) {

        double sum = 0.0;

        //Calculate the sum of the 1/3 + 3/5 ... 95/97 + 97/99
        for(double i = 1.0; i <= 97.0; i += 2){
            sum += i / (i + 2);
        }

        System.out.println(sum);

    }

}
