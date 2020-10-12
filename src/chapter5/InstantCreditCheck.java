package chapter5;

import java.util.Scanner;

/*
    Variable Scope
    Write a program that approves anyone who makes more that 25000
    and has a credit score of 700 or better. Reject all others.
*/
public class InstantCreditCheck {
    // initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){



        // Actual Salary
        double salary = getSalary();
        int score = getCreditScore();
        scanner.close();

        // check if user is qualified
        boolean qualified = isUserQualified(salary, score);

        // notify the user
        notifyUser(qualified);

    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! You've been approved!");
        }
        else {
            System.out.println("Sorry, You've been declined.");
        }
    }
    public static double getSalary(){
        System.out.println("Enter your Salary:");
        return scanner.nextDouble();
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit Score");
        return scanner.nextInt();
    }


    public static boolean isUserQualified(double salary, int creditScore){
        return creditScore >= requiredCreditScore && salary >= requiredSalary;
    }
}
