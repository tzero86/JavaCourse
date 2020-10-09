package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDiceChallenge {
    public static void main (String arg []){

        // what we know
        int boardSize = 20;
        int currentPlayerBoardPosition = 0;
        int maxNumberOfRolls = 5;
        int dice;

        // roll the dice
        Random random = new Random();


        for (int i = 1; i <= maxNumberOfRolls; i++){
            dice = random.nextInt(6) + 1;
            System.out.printf("[*] Get Ready, here is the roll number #%d. You Got a %d.%n", i, dice);
            currentPlayerBoardPosition += dice;

            if (currentPlayerBoardPosition == boardSize){
                System.out.println("[.] You Won!");
                break;
            }
            else if (currentPlayerBoardPosition > boardSize) {
                System.out.printf("[-] Oops! You went past the limit of the board which is %d. Sorry, you lose!", boardSize);
                break;
            }
            else if ( i == maxNumberOfRolls && currentPlayerBoardPosition < boardSize) {
                System.out.printf("[-] You are on position number %d. However You are out of rolls. You didn't make " +
                        "it, better luck next time! You lose.", currentPlayerBoardPosition);
            }
            else {
                System.out.printf("[*] You advanced to position number #%d. and there are %d positions to go.",
                        currentPlayerBoardPosition, (boardSize-currentPlayerBoardPosition));
            }
        }


    }
}
