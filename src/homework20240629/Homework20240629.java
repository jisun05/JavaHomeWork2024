import java.util.InputMismatchException;
package homework20240629;

import java.util.Scanner;

public class Homework20240629 {

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            Scanner reader = new Scanner(System.in);
            System.out.println("What day of the week is it today?\nPlease enter a number from 1 to 7, or -1 to quit: ");
            int day;
            try {
                day = reader.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Wrong input type detected, please enter an integer");
                continue;
            }
            switch (day) {
                case -1:
                    System.out.println("Exiting");
                    isRunning = false;
                    break;
                case 1:
                    System.out.println("The day is:" + DayOfTheWeek.MONDAY);
                    break;
                case 2:
                    System.out.println("The day is:" + DayOfTheWeek.TUESDAY);
                    break;
                case 3:
                    System.out.println("The day is:" + DayOfTheWeek.WEDNESDAY);
                    break;
                case 4:
                    System.out.println("The day is:" + DayOfTheWeek.THURSDAY);
                    break;
                case 5:
                    System.out.println("The day is:" + DayOfTheWeek.FRIDAY);
                    break;
                case 6:
                    System.out.println("The day is:" + DayOfTheWeek.SATURDAY);
                    break;
                case 7:
                    System.out.println("The day is:" + DayOfTheWeek.SUNDAY);
                    break;
                default:
                    System.out.println("Invalid number!");
            }
        }
    }
}
