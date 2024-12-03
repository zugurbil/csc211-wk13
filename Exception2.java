import java.util.Scanner;

public class Exception2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number = 0;
	        boolean validInput = false;
	        
	        // Keep asking until a valid integer is entered
	        while (!validInput) {
	            try {
	                System.out.print("Enter an integer: ");
	                number = scanner.nextInt();  // Trying to read the integer
	                validInput = true;  // Valid input, exit loop
	            } catch (Exception e) {
	                // Catching any exception (like InputMismatchException) and showing error message
	            	System.out.println("Error: Invalid input. Please enter a valid integer.");
	             	e.printStackTrace();
	                scanner.nextLine();  // Clear the buffer to avoid infinite loop on wrong input
	            }
	        }
	        
	        // Output the valid integer entered by the user
	        System.out.println("You entered: " + number);
	        
	        // Closing the scanner to avoid resource leak
	        scanner.close();
	    }

}
