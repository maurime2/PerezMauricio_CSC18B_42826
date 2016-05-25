package database_discussion;

// Fig. 24.23: DisplayAuthors.java
// Displaying the contents of the authors table.
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors 
{
   public static void main(String args[])
   {
      final String DATABASE_URL = "jdbc:derby://localhoast:1527/books";
      final String SELECT_QUERY = 
         "SELECT authorID, firstName, lastName FROM authors";

      // use try-with-resources to connect to and query the database
      try (  
         Connection connection = DriverManager.getConnection(
            DATABASE_URL, "deitel", "deitel"); 
         Statement statement = connection.createStatement(); 
         ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
      {
         // get ResultSet's meta data
         ResultSetMetaData metaData = resultSet.getMetaData();
         int numberOfColumns = metaData.getColumnCount();     
         
         System.out.printf("Authors Table of Books Database:%n%n");

         // display the names of the columns in the ResultSet
         for (int i = 1; i <= numberOfColumns; i++)
            System.out.printf("%-8s\t", metaData.getColumnName(i));
         System.out.println();
         
         // display query results
         while (resultSet.next()) 
         {
            for (int i = 1; i <= numberOfColumns; i++)
               System.out.printf("%-8s\t", resultSet.getObject(i));
            System.out.println();
         } 
      } // AutoCloseable objects' close methods are called now 
      catch (SQLException sqlException)                                
      {                                                                  
         sqlException.printStackTrace();
      }                                                   
   } 
} // end class DisplayAuthors
