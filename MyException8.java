
import java.util.Scanner;

//Custom exception class
class InvalidEntryException extends Exception {
 public InvalidEntryException(String message) {
     super(message);
 }
}

public class MyException8 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter an integer between 1 and 10: ");

     try {
         int input = scanner.nextInt();

         // Check if input is within the valid range
         if (input < 1 || input > 10) {
             throw new InvalidEntryException("Invalid entry! Please enter a number between 1 and 10.");
         }

         System.out.println("You entered a valid number: " + input);

     } catch (InvalidEntryException e) {
         // Handle custom exception
         System.out.println(e.getMessage());
     } catch (Exception e) {
         // Handle other input errors (e.g., non-integer input)
         System.out.println("Invalid input! Please enter an integer.");
     } finally {
         scanner.close();
     }
 }
}
