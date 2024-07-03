package homework20240629;

import java.util.Scanner;

public class Homework20240629  {

    public static void main(String []args){

        Scanner reader = new Scanner(System.in);
        System.out.println("what day of the week is it today? Please enter a number from 1 to 7 : ");
        int day = reader.nextInt();

        switch (day){
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
        }
    }
}
