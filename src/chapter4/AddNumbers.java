package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String arg[]){
        //
        boolean again;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the first number:");
            double firstNumb = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double secondNumb = scanner.nextDouble();
            double sum = firstNumb + secondNumb;

            System.out.println("The Sum result is: " + sum);

            System.out.println("Do you want to run again? answer true or false: ");
            again = scanner.nextBoolean();

        } while (again);
    }
}
