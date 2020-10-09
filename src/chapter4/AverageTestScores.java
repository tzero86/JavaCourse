package chapter4;

import java.util.Scanner;

/*
    Nested Loops:
    Find the average of each student's test scores
*/
public class AverageTestScores {

    public static void main (String arg[]){
        // initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        // Process all students
        for (int i = 0; i < numberOfStudents; i++){
            double total = 0;
            for (int x = 0; x < numberOfTests; x++){
                System.out.println("Enter the Score from test number " + (x + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double averageScore = total/numberOfTests;
            System.out.println("The Test average for Student number " + (i+1) + " is: " + averageScore);
        }
        scanner.close();
    }

}
