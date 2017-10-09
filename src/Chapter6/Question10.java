/**
 * Sean Connolly
 * CIS 3270
 * Chapter 6
 */
package Chapter6;

public class Question10 {

    public static void main(String[] args) { ;
        int numberOfPrimes = 0;
        for(int i = 1; i <= 10000; i++){
            if (isPrime(i)) {
                numberOfPrimes++;
            }
        }

        //Return the sum of the number of primes
        System.out.println("The number of prime numbers less than 10000 are " + numberOfPrimes);
    }

    /**
     * Check whether the number is prime
     * @param number
     * @return true or false
     */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
