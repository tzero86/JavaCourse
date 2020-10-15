package chapter14;

import java.util.Scanner;

public class CoinTossGame {

    private static final Scanner scanner = new Scanner(System.in);
    private static Player player1 = new Player("Hugo");
    private static Player player2 = new Player("Layla");
    public static void main(String[] arg){
        Coin coin = new Coin();
        String player1Guess = getPlayerGuess();
        String player2Guess = playerTwoGuess(player1Guess);
        coin.flip();
        checkWinner(player1Guess, player2Guess, coin.getSide());
    }

    public static void checkWinner(String player1Guess, String player2Guess, String coinSide){
        if (player1Guess.equalsIgnoreCase(coinSide)){
            System.out.printf("Congrats Player 1, %s you won! %n", player1.getName());
        } else if(player2Guess.equalsIgnoreCase(coinSide)){
            System.out.printf("Congrats Player 2, %s you won! %n", player2.getName());
        }
    }

    public static String getPlayerGuess(){
        String guess;
        do {
            System.out.println("Enter your guess, 'tails' or 'heads'");
            guess = scanner.next();
        }while(!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS));

        return guess;
    }

    public static String playerTwoGuess(String guess){
        return guess.equals(Coin.HEADS) ? "tails" : "head";
    }

}
