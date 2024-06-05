import java.util.ArrayList;
import java.util.Arrays;

public class Password {
    // Instance Variables
    public static boolean upper = true;
    public static boolean lower = false;
    public static boolean number = false;
    public static boolean symbol = false;
    public static String uppercheck = "ON";
    public static String lowercheck = "OFF";
    public static String numbercheck = "OFF";
    public static String symbolcheck = "OFF";
    public static ArrayList<String> finalPass = new ArrayList<String>();
    public static ArrayList<String> ucase = new ArrayList<String>();
    public static ArrayList<String> lcase = new ArrayList<String>();
    public static ArrayList<String> integers = new ArrayList<String>();
    public static ArrayList<String> special = new ArrayList<String>();

    // Constructor
    public static void generatePassword() {
        int randomIndex;
        if (upper) {
            finalPass.addAll(ucase);
        }
        if (lower) {
            finalPass.addAll(lcase);
        }
        if (number) {
            finalPass.addAll(integers);
        }
        if (symbol) {
            finalPass.addAll(special);
        }
        randomIndex = (int) (Math.random() * finalPass.size());
        System.out.print(finalPass.get(randomIndex));
    }

    // Methods
    // includeUppercase() has all of the uppercase letters in the array.
    // If: If the boolean variables down below are all false, then you can't turn off the option.
    // Else if: If upper is true, then it would remove all the indices in the array and upper is set to false and would display OFF.
    // Else: When if and else if fails it will have all the uppercase letters in the index and upper is set to true and displays ON.
    public static void includeUppercase() {
        if (!lower && !number && !symbol) {
            System.out.println("You can't turn off Uppercase letters right now.");
        } else if (upper) {
            for (int i = 0; i < ucase.size(); i++) {
                ucase.remove(0);
            }
            upper = false;
            uppercheck = "OFF";
        } else {
            ucase.addAll(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
            upper = true;
            uppercheck = "ON";
        }
    }

    // includeLowercase() has all of the uppercase letters in the array.
    // If the boolean variables down below are false, then you can't turn off the option
    // Else if lower is true, then it would remove all the indices in the array and lower is set to false.
    // Else will have all the lowercase letters in the index and lower is set to true.
    public static void includeLowercase() {
        if (!upper && !number && !symbol) {
            System.out.println("You can't turn off Lowercase letters right now.");
        } else if (lower) {
            for (int i = 0; i < lcase.size(); i++) {
                lcase.remove(0);
            }
            lower = false;
            lowercheck = "OFF";
        } else {
            lcase.addAll(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
            lower = true;
            lowercheck = "ON";
        }
    }

    // includeUppercase() has all of the numbers in the array.
    // If the boolean variables down below are false, then you can't turn off the option
    // Else if number is true, then it would remove all the indices in the array and number is set to false.
    // Else will have all the numbers in the index and number is set to true.
    public static void includeNumbers() {
        if (!upper && !lower && !symbol) {
            System.out.println("You can't turn off Numbers right now.");
        } else if (number) {
            for (int i = 0; i < integers.size(); i++) {
                integers.remove(0);
            }
            number = false;
            numbercheck = "OFF";
        } else {
            integers.addAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
            number = true;
            numbercheck = "ON";
        }
    }

    // includeSymbols() has all of the symbols in the array.
    // If the boolean variables down below are false, then you can't turn off the option
    // Else if symbol is true, then it would remove all the indices in the array and symbol is set to false.
    // Else will have all the symbols in the index and symbol is set to true.
    public static void includeSymbols() {
        if (!upper && !lower && !number) {
            System.out.println("You can't turn off Symbols right now.");
        } else if (symbol) {
            for (int i = 0; i < special.size(); i++) {
                special.remove(0);
            }
            symbol = false;
            symbolcheck = "OFF";
        } else {
            special.addAll(Arrays.asList("~", "`", "!", "@", "#", "$", "%", "^", "&", "&", "*", "(", ")", "_", "-", "+", "=", "{", "[", "}", "]", "|", "\\", ":", ";", "\"", "'", "<", ",", ">", ".", "?", "/"));
            symbol = true;
            symbolcheck = "ON";
        }
    }
}