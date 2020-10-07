package chapter2;

import java.util.Scanner;

public class ChallengeOne {
    public static void main (String arg[]){
        //1. We ask the user for a season (winter, summer, spring, autumn)
        System.out.println("Enter the season of the year(winter, summer, spring, autumn): ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //2. Ask the user for an adjective (cold, hot, windy, cloudy)
        System.out.println("Enter and adjective (cold, hot, windy, cloudy): ");
        String adjective = scanner.nextLine();

        //3. Ask the user for number of cups of coffee
        System.out.println("Enter amount of cups of coffee under those circumstances: ");
        int cups = scanner.nextInt();
        scanner.close();

        //4. We construct the sentence and print it out
        String sentence = "On a " + adjective + " " + season + " day, I drink a minimum of " + cups + " cups of coffee!";
        System.out.println(sentence);
    }
}
