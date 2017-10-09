/**
 * Sean Connolly
 * CIS 3270
 * Chapter 4
 */
package Chapter4;

import java.util.Scanner;

public class Question21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        boolean isValid = isValidSSN(ssn);

        //Check to see if SSN is valid
        if(isValid){
            System.out.println(ssn + " is a valid social security number");
        }else {
            System.out.println(ssn + " is an invalid social security number");
        }

    }

    /**
     * Make sure that the SSN provided is in a valid format
     * @param ssn
     * @return isValid
     */
    public static Boolean isValidSSN(String ssn){

        boolean isValid = false;

        for(int i = 0; i < ssn.length(); i++){

            if(Character.isDigit(ssn.charAt(0)) &&
                    (Character.isDigit(ssn.charAt(1))) &&
                    (Character.isDigit(ssn.charAt(2))) &&
                    (ssn.charAt(3) == '-') &&
                    (Character.isDigit(ssn.charAt(4))) &&
                    (Character.isDigit(ssn.charAt(5))) &&
                    (ssn.charAt(6) == '-') &&
                    (Character.isDigit(ssn.charAt(7))) &&
                    (Character.isDigit(ssn.charAt(8))) &&
                    (Character.isDigit(ssn.charAt(9))) &&
                    (Character.isDigit(ssn.charAt(10)))){
                isValid = true;
            }else{
                isValid = false;
            }

        }

        return isValid;
    }

}
