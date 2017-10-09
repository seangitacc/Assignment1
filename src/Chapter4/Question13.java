/**
 * Sean Connolly
 * CIS 3270
 * Chapter 4
 */
package Chapter4;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char userInput = input.nextLine().charAt(0);

        //Ensure user input is valid
        if(!(userInput >= 'A' && userInput <= 'z')){
            System.out.println(userInput + " is an invalid input!");
            System.exit(0);
        }

        char vowels[] = {'a', 'e', 'i', 'o', 'u',
                        'A', 'E', 'I', 'O', 'O'};

        boolean isVowel = false;

        //Check to see if user input is a vowel
        for(int i = 0; i < vowels.length; i++){

            if(userInput == vowels[i]){
                isVowel = true;
            }

        }

        String result = isVowel ? userInput + " is a vowel" : userInput + " is a consonant"; //Tell user whether input is a vowel or consonant

        System.out.println(result);
    }

}
