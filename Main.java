import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int option = 0;
        int length;
        Scanner scan = new Scanner(System.in);
        Password.ucase.addAll(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        // This while loop breaks once the user inputs 5. The purpose of this while loop is to the power to the user's
        // Hands by turning the options on or off to customize their random password.
        while (option != 5) {
            System.out.println("1. Include Uppercase Characters: " + Password.uppercheck);
            System.out.println("2. Include Lowercase Characters: " + Password.lowercheck);
            System.out.println("3. Include Numbers: " + Password.numbercheck);
            System.out.println("4. Include Symbols/Special Characters: " + Password.symbolcheck);
            System.out.println("5. Print my password");
            System.out.println("What do you want to do? (Enter a number)");
            option = scan.nextInt();
            if (option == 1) {
                Password.includeUppercase();
            } else if (option == 2) {
                Password.includeLowercase();
            } else if (option == 3) {
                Password.includeNumbers();
            } else if (option == 4) {
                Password.includeSymbols();
            } else if (option == 5) {
                System.out.println("How long do you want the password to be?");
            } else {
                System.out.println("You've provided an invalid response. Please try again.");
            }
        }
        // This piece of code asks the user how long will the password be.
        // The for loop will continue however many times the number the user inputs in the length variable.
        length = scan.nextInt();
        for (int i = 0; i < length; i++) {
            Password.generatePassword();
        }
    }
}