package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static void main(String[] arg){
        int userDay = getUserDay();
        printUserDay(userDay);
    }
    public static int getUserDay(){
        System.out.println("Enter your Day number:");
        return scanner.nextInt();
    }

    public static void printUserDay(int userDay){
        System.out.printf("The day for #%d is %s", userDay, week[userDay-1]);
    }

}
