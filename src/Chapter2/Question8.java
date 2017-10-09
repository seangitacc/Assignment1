/**
 * Sean Connolly
 * CIS 3270
 * Chapter 2
 */
package Chapter2;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis / 1000L;
        long currentSecond = totalSeconds % 60L;
        long totalMinutes = totalSeconds / 60L;
        long currentMinute = totalMinutes % 60L;
        long totalHours = totalMinutes / 60L;
        long currentHour = totalMinutes % 24L;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        long offset = (long)input.nextInt();
        currentHour += offset;
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT"); //based on GMT offset, show the current time
    }

}
