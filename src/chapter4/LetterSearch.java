package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main (String arg[]){
        //Get the string
        System.out.println("Enter Some Text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        boolean letterFound = false;
        scanner.close();

        // search the text and see if it contains the letter A
        for (int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("The text entered contains the letter A");
        }
        else {
            System.out.println("The text entered did not contain a letter A");
        }


    }
}
