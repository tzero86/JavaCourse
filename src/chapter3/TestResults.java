package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String arg[]){

        // Get test score
        System.out.println("Enter your Score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        // Determine letter grade (A, B, C, D, E, F)
        char grade; // single quotation marks for char, double for Strings

        if (score < 60) {
            grade = 'F';
        }
        else if (score < 70){
            grade = 'D';
        }
        else if (score < 80){
            grade = 'C';
        }
        else if (score < 90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
