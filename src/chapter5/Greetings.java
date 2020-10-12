package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main (String arg[]){
        System.out.println("Enter your Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }
}
