/*
 Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
*/
// Custom Exception class
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class Practical20 {

    // Method to check if the string contains vowels
    public static void checkVowels(String input) throws NoVowelsException {
        // Convert the string to lowercase to make it case insensitive
        input = input.toLowerCase();

        // Check if the string contains vowels
        boolean containsVowel = false;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                containsVowel = true;
                break;  // No need to check further once we find a vowel
            }
        }

        // If no vowel is found, throw the custom exception
        if (!containsVowel) {
            throw new NoVowelsException("The string does not contain any vowels.");
        } else {
            System.out.println("The string contains vowels.");
        }
    }

    public static void main(String[] args) {
        // Test the method
        String testString = "rhythm"; // Change this to test different inputs

        try {
            checkVowels(testString);
        } catch (NoVowelsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
