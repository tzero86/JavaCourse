package chapter3;

import java.util.Scanner;

/*
    If Statement
    Problem: All salespeople get a payment of $1000 a week. Any Salespeople who exceeds 10 sales gets an extra $250.
*/
public class SalaryCalculator {
    public static void main (String arg[]){
        // initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // get any unknown values
        System.out.println("How Many sales did the employee make this week?: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // detour for bonus earners
        if (sales >= quota) {
            salary += bonus;
        }

        // output
        System.out.println("The Sales Employee resulting salary is: $" + salary);

    }
}
