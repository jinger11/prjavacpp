/*
18. Write a Java program that reads a list of integers from the user and throws anexception if any numbers are duplicates
*/
import java.util.*;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class Practical18 {

    // Method to read integers and check for duplicates
    public static void checkForDuplicates(List<Integer> numbers) throws DuplicateNumberException {
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        // Check if any number is duplicated
        for (Integer number : numbers) {
            if (!uniqueNumbers.add(number)) {
                // If add() returns false, the number is already in the set, so it's a duplicate
                throw new DuplicateNumberException("Duplicate number found: " + number);
            }
        }

        // If no duplicates, print the list
        System.out.println("The list contains no duplicates.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // List to store the user input
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter the number of integers you want to input:");
        int n = sc.nextInt();
        
        System.out.println("Enter the integers:");

        // Read integers from the user
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        // Check for duplicates and handle exception
        try {
            checkForDuplicates(numbers);
        } catch (DuplicateNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
