import java.util.Scanner;

public class BadArray2 {
	/**
	This program causes an error and crashes.
	*/


	public static void main(String[] args) {
	   // Create an array with 3 elements.
	   int[] numbers = { 1, 2, 3 };

	   // Attempt to read beyond the bounds
	   // of the array.
	   try {
	   for (int i = 0; i <= 3; i++)
	      System.out.println(numbers[i]);
           }
	   catch (Exception e)
	   {
	      System.out.println("The following error occurred: " + e.getMessage());
	      System.out.println("Now fix the problem");
	      for (int i = 0; i < 3; i++)
		      System.out.println(numbers[i]);
	           }
	}
	  
}
