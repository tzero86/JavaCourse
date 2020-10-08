package chapter3;

import java.util.Scanner;

/*
If ELSE
1. All salespeople are expected to make at least 10 sales each week.
2. for those who do, they receive a congratulatory message.
3. for those who don't they are informed of how many sales they were short by.
 */
public class QuotaCalculator {
    public static void main(String arg[]){
        //Initialize values we know
        int quota = 10;

        //get values we don't know
        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // make decision and output
        if (sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("Sorry! You did not met your quota, you were " + salesShort + " sales short.");
        }
    }
}
