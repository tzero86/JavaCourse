package chapter4;

import java.util.Scanner;

/*
    For Loop:
    Write a cashier program that will scan a given number of items and tally the cost.
*/
public class Cashier {
    public static void main (String arg[]){
        // get number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double  total  = 0;

        // create a loop to iterate through all of the items and accumulate the costs
        for (int i = 0; i < quantity; i++){
            System.out.println("Enter the cost of the item number " + (i+1));
            double price  = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("The Total is $" + total);
    }
}
