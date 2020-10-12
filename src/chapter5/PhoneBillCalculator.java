package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double overageMinuteCost = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){

        double planFee = getUserPlanFee();
        double overage = calculateUserOverageCost(getUserOverageMinutes());
        double taxes = calculateUserTaxes(planFee + overage);
        double totalBill = planFee + overage + taxes;

        scanner.close();

        // we print out the results
        printUserBill(planFee, overage, taxes, totalBill);

    }

    //
    public static double getUserPlanFee(){
        System.out.println("Enter your Phone Plan Fee:");
        return scanner.nextDouble();
    }

    public static double getUserOverageMinutes(){
        System.out.println("Enter your overage minutes:");
        return scanner.nextDouble();
    }

    public static double calculateUserTaxes(double subtotal){
        return subtotal * taxRate;
    }

    public static double calculateUserOverageCost(double overageMinutes){
        return overageMinuteCost * overageMinutes;

    }

    public static void printUserBill(double planFee, double overage, double taxes, double total){
        System.out.println("[*] Phone Bill Statement:");
        System.out.printf("[-] Plan Cost: $%.2f %n", planFee); // %d is for integers use %f
        // instead, it works for both float and double types:
        System.out.printf("[-] Overage Minutes: $%.2f %n", overage);
        System.out.printf("[-] Taxes: $%.2f %n", taxes);
        System.out.printf("[-] Total: $%.2f %n", total);
    }
}
