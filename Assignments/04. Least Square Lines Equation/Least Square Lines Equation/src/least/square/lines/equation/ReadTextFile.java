/*
E:\00. Programing\01. CSC 18B - Java Advanced Objects\PerezMauricio_CSC18B_42826\Assignments\04. Least Square Lines Equation\Least Square Lines Equation\src\least\square\lines\equation\another_test.txt
%-10d   - Decimal -10
%-12s   - 12 character string
%-12s   - 12 character string
%10.2f  -   10 charaater presision 2 float
%n - Line Seperator
 */
package least.square.lines.equation;
//libraries


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
   //Global Variables
     public double x = 0;
     public double y = 0;
     public double sumX=0;
     public double sumY=0;
     public double sumXX=0;
     public double prodXY=0;
  public String textfile;
    //constructor initializes part with paremeter part
  /* 
  public ReadTextFile(String textfile, double x,double y,double sumX,double sumY,double sumXX,double prodXY)     //Constructor name is class name
    {
        this.x = x;
        this.y = y;
        this.sumX = sumX;
        this.sumY = sumY;
        this.sumXX = sumXX;
        this.prodXY = prodXY;        
    }
*/

                //GET AND SET METHODS
                    //method to set x
                   public void setX(double x)
                   {
                       this.x = x;
                   }

                   //Method to retrive x
                   public double getX()
                   {
                       return x;
                   }


                   //method to set y
                   public void setY(double y)
                   {
                       this.y = y;
                   }
                   //Method to retrive y
                   public double getY()
                   {
                       return y;
                   }

                   //method to set sumX
                   public void setsumX(double sumX)
                   {
                       this.sumX = sumX;
                   }
                   //Method to retrive sum x
                   public double getSumX()
                   {
                       return sumX;
                   }

                   //method to set sumY
                   public void setsumY(double sumY)
                   {
                       this.sumY = sumY;
                   }
                   //Method to retrive Sum y 
                   public double getSumY()
                   {
                       return sumY;
                   }

                   //method to set sumXX
                   public void setsumXX(double sumXX)
                   {
                       this.sumXX = sumXX;
                   }
                   //Method to retrive sumXX 
                   public double getSumXX()
                   {
                       return sumXX;
                   }


                   //method to set sumXY
                   public void setProdXY(double prodXY)
                   {
                       this.prodXY = prodXY;
                   }
                   //Method to retrive sumXX 
                   public double getProdXY()
                   {
                       return prodXY;
                   }    
     
   public static void readText(String textFile, double x,double y,double sumX, double sumY,double sumXX,double prodXY)
   {
      openFile(textFile);
      readRecords(x, y, sumX, sumY, sumXX,prodXY);
      closeFile();
   } 

   // open file clients.txt
   public static void openFile(String textFile)
   {
      try
      {
         input = new Scanner(Paths.get(textFile)); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   // read record from file
   public static void readRecords(double x,double y,double sumX, double sumY,double sumXX, double prodXY)
   {  
      int count = 0;
      double m = 0;
      double b = 0;
      System.out.printf("%s%30s%n", "Temperature (c)",
         "Resistance (ohms)");

      try 
      {
         while (input.hasNext()) // while there is more to read
         {  //Read in X and Y
            x = input.nextDouble();
            y = input.nextDouble();
            
            // display record contents                     
            System.out.printf("%-30.4f%-30.4f%n", x, y);
            
            //Math
            sumX  = sumX+x;
            sumY  = sumY+y; 
            sumXX = ((sumXX)+(x*x));
            count++;

         }//While loop End
            
            //OUTPUT MATH
            if(count >= 0)
            {
            prodXY = sumX*sumY;
            System.out.println("***********************************************");
            System.out.println(count+" ordered pairs processed...");
            System.out.printf("%s%30s%30s%30s%n", "Sum of X","Sum of Y","SUM OF XX","Prod SumX Sum Y");
            System.out.printf("%-30.4f%-30.4f%-30.4f%-30.4f%n", sumX, sumY,sumXX,prodXY);
            System.out.println("***********************************************");
                //Slope Calc
               m=((prodXY)-  ((sumX)*(sumY/count)) ) / ((sumXX)-((sumX)*(sumX/count))) ;
               // y-intercept calc
               b=(sumY/count)-(sumX/count)*m;
            System.out.println("***********************************************");
            System.out.println("Equation of least squares line: y="+m+"x+"+b);   
            }//END OUTPUT MATH
            
      }//Try block end 
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
                   //Math and Output to Terminal:
                    //System.out.printf("%10.2f",x);

                   if (input != null)
                      input.close();
                } 
} // end class ReadTextFile
