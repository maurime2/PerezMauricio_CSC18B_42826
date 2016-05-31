/*
Mauricio S. Perez
Assignment 4: Least Square Lines Equation - Text File I/O

Write a Java console application, that does the following:

1. Prompt the user for the name of the text file
2. Opens the text file and reads in the ordered pair data 
    (which is stored in the text file in the format of: 
        xxx.xxxxx yyy.yyyy where there is a space between the numeric values
        and a carriage return/line feed after the last numeric value on each 
        line).

3. While looping through the read ordered pairs, have variables for the following:
    
    1. keep count of the number of ordered pairs processed
    2. sum of the x values
    3. sum of the y values
    4. sum of the square of the x values
    5. sum of the products of x and y

4. After the ordered pairs have been read in, close the file.

5. Compute the regression coefficients m and b for the equation of the least
    squares line equation, where m is the slope and b is the y-intercept.


6. The output to the terminal screen must be:  
    Equation of least squares line: y = 3.33658x + 700.82837

7. The data file named another_test.txt, should have the output to the 
    terminal screen:  
    Equation of least squares line: y = -0.07926x + 754.90472


    The following items to be turned in:
    1. Working source code (up to 30 points)
    2. Correctly completed PSP Spreadsheet (with time properly documented) ( up to 10 points )
    3. Flowchart of your program's logic ( up to 10 points )

    Path to open file: 
    
    E:\\00. Programing\\01. CSC 18B - Java Advanced Objects\\PerezMauricio_CSC18B_42826\\Assignments\\04. Least Square Lines Equation\\ReadTextFile\\src\\clients.txt
    E:\00. Programing\01. CSC 18B - Java Advanced Objects\PerezMauricio_CSC18B_42826\Assignments\04. Least Square Lines Equation\Least Square Lines Equation\src\least\square\lines\equation\another_test.txt
    E:\00. Programing\01. CSC 18B - Java Advanced Objects\PerezMauricio_CSC18B_42826\Assignments\04. Least Square Lines Equation\Least Square Lines Equation\src\least\square\lines\equation\data.txt


*/

//Libraries
package least.square.lines.equation;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LeastSquareLinesEquation {

    public static void main(String[] args) {
        //Declare Local Variables
        Scanner input = new Scanner (System.in);    //creates a scanner "input"
        String textFile = null;
      double x = 0;
      double y = 0;
      double sumX=0;
      double sumY=0;
      double sumXX=0;
      double prodXY=0;
      
        //Declare Objects
        ReadTextFile ReadTextFileObject = new ReadTextFile();//Reads in Text File
        
        //Prompt the user for the name of the text file
        System.out.print("Input The File Path Name: ");
        textFile=input.nextLine();
        
        //Reads In text
        ReadTextFileObject.readText(textFile,  x, y, sumX,  sumY, sumXX, prodXY);
        
        
    }
    
}
