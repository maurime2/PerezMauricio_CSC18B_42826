//Libraries
package addition;
// Fig. 12.2: Addition.java
// Addition program that uses JOptionPane for input and output.
import javax.swing.JOptionPane; 

public class Addition 
{
   public static void main(String[] args)
   {
      // obtain user input from JOptionPane input dialogs
        //First Number
        String firstNumber = 
          JOptionPane.showInputDialog("Enter first integer");
        //Second Number
        String secondNumber =
            JOptionPane.showInputDialog("Enter second integer");

      // convert String inputs to int values for use in a calculation
      float number1 = Integer.parseInt(firstNumber); 
      float number2 = Integer.parseInt(secondNumber);
      int sumInt = Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber);
//      float sum = number1 + number2; // add numbers
      
 //     String sumStr = String.valueOf(sum);

      // display result in a JOptionPane message dialog
      JOptionPane.showMessageDialog(null, "The sum is " + sumInt, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
   } 
} // end class Addition


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
