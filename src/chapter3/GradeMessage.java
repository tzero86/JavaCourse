package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String arg[]){
        // get grade from the user
        System.out.println("Enter your grade letter: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
       // scanner.close();
        String message;

        switch (grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh oh, better luck next time!";
                break;
            default:
                message = "Error! Invalid grade entered.";
        }
        System.out.println(message);
    }
}
