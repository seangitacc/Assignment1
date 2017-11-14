/**
 * Sean Connolly
 * CIS 3270
 * Chapter 1
 */
package Chapter1;

//Hey Sean u sux

public class Question11 {

    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int daysInAYear = 365;
        int hoursInAYear = 24 * daysInAYear;
        int minutesInAYear = 60 * hoursInAYear;
        int secondsInAYear = 60 * minutesInAYear;
        double birthsInAYear = (double)secondsInAYear / 7.0D; //Calculate births in a year
        double deathsInAYear = (double)secondsInAYear / 13.0D; //Calculate deaths in a year
        double immigrantsInAYear = (double)secondsInAYear / 45.0D; //Calculate immigration in a year

        //Display the population for the next 5 years
        for(int i = 1; i <= 5; ++i) {
            currentPopulation = (int)((double)currentPopulation - deathsInAYear + birthsInAYear + immigrantsInAYear);
            System.out.println("The current population for year " + i + " is: " + currentPopulation);
        }

    }

}
