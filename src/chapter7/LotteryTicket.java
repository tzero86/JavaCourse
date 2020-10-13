package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER= 69;

    public static void main (String[] arg){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i=0; i < LENGTH; i++){
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Sequentially Searches for a given value to see if it is part of a given array.
     * @param array Array to search through.
     * @param numberToSearchFor Value to search for.
     * @return true if found, false if not.
     */
    public static boolean search(int[] array, int numberToSearchFor){
        // enhanced loop
        for (int value : array){
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        // array must be sorted first.
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        return index >= 0;
    }

    public static void printTicket(int[] ticket){
        for (int i=0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
