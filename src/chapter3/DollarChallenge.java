package chapter3;

import java.util.Scanner;

public class DollarChallenge {
    public static void main(String arg[]){
        // We declare the known data
        double penniesWorth = 0.1;
        double nickelWorth = 0.5;
        double dimeWorth = .10;
        double quarterWorth = .25;
        int dollarWorth = 1;

        // We ready our scanner to get user inputs
        Scanner scanner = new Scanner(System.in);

        // We as the user for the data
        System.out.println("Enter your number of pennies: ");
        int userPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels: ");
        int userNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes: ");
        int userDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters: ");
        int userQuarters = scanner.nextInt();


        // Now we need to do the calculations and see how much under or above the user was from a dollar, or if it was
        // just a dollar.


    }
}
