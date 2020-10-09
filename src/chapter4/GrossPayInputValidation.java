package chapter4;

import java.util.Scanner;

/*
WHILE LOOPS
Each store employee makes $15 an hour. Write a program that allows the employee to enter the number of hours
worked for the week. Do not allow overtime.
*/
public class GrossPayInputValidation {
    public static void main(String arg[]){
        int hourlyRate = 15;
        int maxHours = 40;

        //get inputs
        System.out.println("How many hours did you work this week?: ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid amount of hours, overtime is not allowed. Hours must be 1 to 40. Try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double grossSalary = hourlyRate *  hoursWorked;
        System.out.println("Your Gross pay is: $" + grossSalary);

    }
}
