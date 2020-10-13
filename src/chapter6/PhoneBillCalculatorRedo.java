package chapter6;

import java.util.Scanner;

public class PhoneBillCalculatorRedo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        int userID = getUserId();
        double fee = getUserPlanFee();
        double planMinutes = getUserPlanMinutes();
        double overageMinutes = getUserOverageMinutes();

        PhoneBill userBill = new PhoneBill(userID,fee,planMinutes,overageMinutes);
        userBill.printUserBill();
        scanner.close();

    }

    public static int getUserId(){
        System.out.println("Enter your Numeric UserID:");
        return scanner.nextInt();
    }

    public static double getUserPlanMinutes(){
        System.out.println("Enter the minutes included with your plan:");
        return scanner.nextDouble();
    }

    public static double getUserPlanFee(){
        System.out.println("Enter your Phone Plan Fee:");
        return scanner.nextDouble();
    }

    public static double getUserOverageMinutes(){
        System.out.println("Enter your overage minutes:");
        return scanner.nextDouble();
    }
}
