package chapter8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        String username = getUsername();
        String oldPassword = getUserOldPassword();
        String password = getUserPassword();
        validatePassword(username, oldPassword, password);
    }

    public static String getUsername(){
        System.out.println("Enter your Username:");
        return scanner.next();
    }

    public static String getUserPassword(){
        System.out.println("Enter your Password:");
        return scanner.next();
    }

    public static String getUserOldPassword() {
        System.out.println("Enter your OLD Password:");
        return scanner.next();
    }

    public static boolean isPasswordLengthOk(String password){
        return password.length() >= 8;
    }

    public static boolean isUsernameInPassword(String username, String password){
        return password.toLowerCase().contains(username.toLowerCase());
    }

    public static boolean areSpecialCharactersIncluded(String password){
        return Pattern.matches("[a-zA-Z0-9 ]*",password);
    }

    public static boolean areUppercaseLettersIncluded(String password){
        return password.matches(".*[A-Z].*"); // returns true if at least one char matches the regex for uppercase
    }

    public static void validatePassword(String username, String oldPass, String password){
        if(isPasswordLengthOk(password)){
            // The pass is at least 8 chars long
            if(!isUsernameInPassword(username, password)){
                // the pass does not include the username in it
                if(!areSpecialCharactersIncluded(password)){
                    // there are special characters in the password.
                    if (areUppercaseLettersIncluded(password)){
                        if(!password.equals(oldPass)){
                            // The password is not the old one, the password is valid.
                            System.out.printf("[-]The new password Selected is valid: %s", password);
                        }
                        else {
                            System.out.println("[*] ERROR: The new password cannot be the same as the old password.");
                        }
                    } else {
                        System.out.println("[*] ERROR: The new password MUST include at least one uppercase letter.");
                    }

                }
                else {
                    System.out.println("[*] ERROR: The new password MUST contain a special character.");
                }
            }
            else {
                System.out.println("[*] ERROR: The new password cannot contain the username");
            }
        }
        else {
            System.out.println("[*] ERROR: The new password MUST be at least 8 characters long.");
        }
    }
}
