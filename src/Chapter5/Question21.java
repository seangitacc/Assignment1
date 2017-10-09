/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

import java.util.Scanner;

public class Question21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        int loanAmount = input.nextInt();
        System.out.print("Number of years: ");
        int numOfYears = input.nextInt();

        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");

        double interest = 5;

        //Display the interest rate (increasing by .125% each time), the monthly payment, and total payment until interest hits 8%
        for(double i = 5; i <= 8; i += .125 ){
            System.out.printf("%.4f",i);
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12));
            System.out.print("\t\t\t");
            System.out.printf("%-19.2f", monthlyPayment);
            System.out.printf("%-8.2f\n",(monthlyPayment * 12) * numOfYears);
            System.out.println();
            interest += .125;
        }
    }

}
