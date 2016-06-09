//libraries
package readtextfile;

// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
   private static Scanner input;

   public static void main(String[] args)
   {
      openFile();
      readRecords();
      closeFile();
   } 

   // open file clients.txt
   public static void openFile()
   {
      try
      {
         input = new Scanner(Paths.get("E:\\00. Programing\\01. CSC 18B - Java Advanced Objects\\PerezMauricio_CSC18B_42826\\Assignments\\04. Least Square Lines Equation\\ReadTextFile\\src\\clients.txt")); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   // read record from file
   public static void readRecords()
   {
      System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
         "First Name", "Last Name", "Balance");

      try 
      {
         while (input.hasNext()) // while there is more to read
         {
            // display record contents                     
            System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), 
               input.next(), input.next(), input.nextDouble());
         }
      } 
      catch (NoSuchElementException elementException)
      {
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException)
      {
         System.err.println("Error reading from file. Terminating.");
      } 
   } // end method readRecords

   // close file and terminate application
   public static void closeFile()
   {
      if (input != null)
         input.close();
   } 
} // end class ReadTextFile
