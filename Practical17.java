/* Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2 are not integers, the program would throw a Number Format Exception. If Num2 were zero, the program would throw an ArithmeticException. Display the exception
*/
import java.util.Scanner;

public class Practical17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input two numbers from the user
            System.out.print("Enter the first number (Num1): ");
            String input1 = sc.nextLine();
            System.out.print("Enter the second number (Num2): ");
            String input2 = sc.nextLine();

            // Try to parse the inputs into integers
            int num1 = Integer.parseInt(input1); // May throw NumberFormatException
            int num2 = Integer.parseInt(input2); // May throw NumberFormatException

            // Perform division (may throw ArithmeticException if num2 is zero)
            int result = num1 / num2;
            System.out.println("Result of division: " + result);

            // Example of ArrayIndexOutOfBoundsException handling
            int[] arr = new int[5];
            System.out.println("Accessing array element at index 6: " + arr[6]); // May throw ArrayIndexOutOfBoundsException

        } catch (NumberFormatException e) {
            // Handle the case when input is not a valid integer
            System.out.println("Exception: Invalid input, please enter integers only.");
        } catch (ArithmeticException e) {
            // Handle the case when dividing by zero
            System.out.println("Exception: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exception
            System.out.println("Exception: Array index is out of bounds.");
        } catch (Exception e) {
            // Catch any other exceptions that might occur
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close(); // Close the scanner resource
            System.out.println("Execution completed.");
        }
    }
}
