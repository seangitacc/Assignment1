/**
 * Sean Connolly
 * CIS 3270
 * Chapter 3
 */
package Chapter3;

public class Question24 {

    public static void main(String[] args) {

        int yourCard = (int)(Math.random() * (53 - 1)) + 1; //Calculate a number 1 - 52, inclusive
        System.out.print("Your number is: " + yourCard);

        System.out.print("\nThe card you picked is ");
        //Find the value of the card that was picked (the type of card depends on the range it falls in from 1 - 52)
        if(yourCard <= 13){
            switch(yourCard){
                case 1: System.out.print("Ace"); break;
                case 2: System.out.print("2"); break;
                case 3: System.out.print("3"); break;
                case 4: System.out.print("4"); break;
                case 5: System.out.print("5"); break;
                case 6: System.out.print("6"); break;
                case 7: System.out.print("7"); break;
                case 8: System.out.print("8"); break;
                case 9: System.out.print("9"); break;
                case 10: System.out.print("10"); break;
                case 11: System.out.print("Jack"); break;
                case 12: System.out.print("Queen"); break;
                case 13: System.out.print("King");
            }
            System.out.print(" of Clubs.");
        }else if(yourCard <= 26){
            switch(yourCard){
                case 14: System.out.print("Ace"); break;
                case 15: System.out.print("2"); break;
                case 16: System.out.print("3"); break;
                case 17: System.out.print("4"); break;
                case 18: System.out.print("5"); break;
                case 19: System.out.print("6"); break;
                case 20: System.out.print("7"); break;
                case 21: System.out.print("8"); break;
                case 22: System.out.print("9"); break;
                case 23: System.out.print("10"); break;
                case 24: System.out.print("Jack"); break;
                case 25: System.out.print("Queen"); break;
                case 26: System.out.print("King");
            }
            System.out.print(" of Diamonds.");
        }else if(yourCard <= 39){
            switch(yourCard){
                case 27: System.out.print("Ace"); break;
                case 28: System.out.print("2"); break;
                case 29: System.out.print("3"); break;
                case 30: System.out.print("4"); break;
                case 31: System.out.print("5"); break;
                case 32: System.out.print("6"); break;
                case 33: System.out.print("7"); break;
                case 34: System.out.print("8"); break;
                case 35: System.out.print("9"); break;
                case 36: System.out.print("10"); break;
                case 37: System.out.print("Jack"); break;
                case 38: System.out.print("Queen"); break;
                case 39: System.out.print("King");
            }
            System.out.print(" of Hearts.");
        }else if(yourCard <= 52){
            switch(yourCard){
                case 40: System.out.print("Ace"); break;
                case 41: System.out.print("2"); break;
                case 42: System.out.print("3"); break;
                case 43: System.out.print("4"); break;
                case 44: System.out.print("5"); break;
                case 45: System.out.print("6"); break;
                case 46: System.out.print("7"); break;
                case 47: System.out.print("8"); break;
                case 48: System.out.print("9"); break;
                case 49: System.out.print("10"); break;
                case 50: System.out.print("Jack"); break;
                case 51: System.out.print("Queen"); break;
                case 52: System.out.print("King");
            }
            System.out.print(" of Spades.");
        }

    }

}
