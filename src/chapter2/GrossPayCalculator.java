package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg[]){
        //1. Get number of hours worked
        System.out.println("Enter The numbers of hours worked:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get hourly pay rate
        System.out.println("Enter The hourly pay rate:");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours by pay rate.
        double grossPay = hours * rate;

        //4. display the result
        System.out.println("The Employee gross pay is: $" + grossPay);

    }
}
