import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class FileIO1 {
  public static void main(String[] args) {
/*  The createNewFile() function is a part of File class in Java . It creates new empty file.
 *  createNewFile() method returns a boolean value: true if the file was successfully created, 
 *  and false if the file already exists.
 */
    try {
      //File myObj = new File("filename.txt");
      File myObj = new File("C:\\Users\\Zihni\\Downloads\\filenameZU.txt");  
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    File myObj = new File("C:\\Users\\Zihni\\Downloads\\filenameZU.txt");  
    if (myObj.exists()) {
        System.out.println("File name: " + myObj.getName());
        System.out.println("Absolute path: " + myObj.getAbsolutePath());
        System.out.println("Writeable: " + myObj.canWrite());
        System.out.println("Readable " + myObj.canRead());
        System.out.println("File size in bytes " + myObj.length());
      } 
    writeToFile();
    ReadFile();
    
  }

public static void writeToFile() {
	  try {  
		     // FileWriter myWriter = new FileWriter("filename.txt");
		      FileWriter myWriter = new FileWriter("C:\\Users\\Zihni\\Downloads\\filenameZU.txt"); 
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		  }  
public static void ReadFile() {
    try {
      //File myObj = new File("filename.txt");
      File myObj = new File("C:\\Users\\Zihni\\Downloads\\filenameZU.txt");  
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}