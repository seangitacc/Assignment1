/**
 * Sean Connolly
 * CIS 3270
 * Chapter 5
 */
package Chapter5;

public class Question18 {

    public static void main(String[] args) {

        //Print out the patterns as indicated in the book
        System.out.println("Pattern A");
        for(int i = 0; i < 7; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for(int i = 6; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");
        for(int i = 0; i < 7; i++){
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for(int i = 0; i < 6; i++){
            for(int k = 0; k < i; k++){
                System.out.print("  ");
            }
            for(int j = 0; j < 6 - i; j++){
                System.out.print((j + 1) + " ");
            }
            System.out.println("");
        }

    }

}
