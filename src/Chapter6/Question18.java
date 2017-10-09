/**
 * Sean Connolly
 * CIS 3270
 * Chapter 6
 */
package Chapter6;

import java.util.Scanner;

public class Question18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.println(checkPassword(password));

    }

    /**
     * Check the password to make sure it fits all criteria specified in the book
     * @param password
     * @return true or false
     */
    public static boolean checkPassword(String password){

        int countNums = 0;

        if(password.length() < 8){
            return false;
        }else{

            for(int i = 0; i < password.length(); i++){
                if(Character.isDigit(password.charAt(i))) {
                    countNums++;
                }
                if(!(Character.isLetterOrDigit(password.charAt(i)))){
                    return false;
                }
            }

            if(countNums < 2){
                return false;
            }

        }

        return true;

    }

}
