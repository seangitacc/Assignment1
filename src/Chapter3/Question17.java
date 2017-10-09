/**
 * Sean Connolly
 * CIS 3270
 * Chapter 3
 */
package Chapter3;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Select Scissor (0), Rock (1), or Paper(2): ");
        int userInput = input.nextInt();

        System.out.print("You are");

        //Find what user is
        switch(userInput){
            case 0: System.out.print(" scissor."); break;
            case 1: System.out.print(" rock."); break;
            case 2: System.out.print(" paper."); break;
        }

        int randomInput = (int)(Math.random() * 3);//Generate a number 0 -2

        System.out.print(" The computer is");

        //Find what the computer is
        switch(randomInput){
            case 0: System.out.print(" scissor."); break;
            case 1: System.out.print(" rock."); break;
            case 2: System.out.print(" paper."); break;
        }

        //Find out who won
        if(userInput == randomInput){
            System.out.print(" It is a draw.");
        }else if(userInput == 0 && randomInput == 1){
            System.out.print(" You lost.");
        }else if(userInput == 0 && randomInput == 2){
            System.out.print(" You won.");
        }else if(userInput == 1 && randomInput == 0){
            System.out.print(" You won.");
        }else if(userInput == 1 && randomInput == 2){
            System.out.print(" You lost.");
        }else if(userInput == 2 && randomInput == 0){
            System.out.print(" You lost.");
        }else if(userInput == 2 && randomInput == 1){
            System.out.print(" You won.");
        }

    }

}
