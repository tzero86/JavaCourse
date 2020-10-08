package chapter3;

/*
To Qualify for a loan, a person mus make at least $30,000
and have been working at their current job for at least 2 years.
*/

import java.util.Scanner;

public class LoadQualifier {
    public static void main (String arg[]){

        //What we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Get what we don't know
        System.out.println("Enter your Salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years at your current job?: ");
        double years = scanner.nextDouble();
        scanner.close();

        // make decision
        if (salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congratulations you qualify for the loan.");
            }
            else{
                System.out.println("Sorry, you don't qualify for a loan at this time. You must have worked at " +
                                "your current job for at least " + requiredYearsEmployed + " years.");
            }
        }
        else{
            System.out.println("Sorry, you don't qualify for a loan at this time. You must earn at least $" +
                     requiredSalary + " to qualify for this line of loans.");
        }
}}
