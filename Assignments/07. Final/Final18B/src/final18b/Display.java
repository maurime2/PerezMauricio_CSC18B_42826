//Libraries
package final18b;
import java.awt.FlowLayout;             //organises Flow
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Container;  //For Flow Layout

//Display
 public class Display extends JFrame 
{
   //JBUTTONS
    private final JButton previousB; // button with just text
    private final JButton nextB; // button with just text
    private final JButton findB; // button with just text
    private final JButton browsB; // button with just text
    private final JButton insertB; // button with just text
    private final JButton deleteB; // button with just text
   

   //JLABLES
   private final JLabel ofL; // JLabel with just text
   private final JLabel carIDL; // JLabel with just text
   private final JLabel carMakeL; // JLabel constructed with text and icon
   private final JLabel carModleL; // JLabel with added text and icon
   private final JLabel carYearL; // JLabel with added text and icon
   private final JLabel carMileageL; // JLabel with added text and icon
   private final JLabel promptL; // JLabel with added text and icon
   
           
   
   
   //TEXT LABLES
   private final JTextField firstDBT; // text field with set size
   private final JTextField lastDBT; // text field with set size
   private final JTextField carIDT; // text field with set size
   private final JTextField carMakeT; // text field with set size
   private final JTextField carModelT; // text field with set size
   private final JTextField carYearT; // text field with set size
   private final JTextField carMilegeT; // text field with set size
   private final JTextField entryT; // text field with set size
   
   private final JTextField textField2; // text field with text
   private final JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text
   
   String first = "f";
   String last  = "l";
   String id    = "1";
   String car   = "Car here";
   String model = "Model Here";
   String carY  = "Year Here"; 
   String carM  = "Mileage Here";
   
   //size of width for Text Lables
   int size = 21;
   
   
   // TextFieldFrame constructor adds JTextFields to JFrame
   public Display()
   {
      super("Cars");    //TOP OF DISPLAY SHOWS CARS
      setLayout(new FlowLayout());

      //Constructors
         //TOP PART: BUTTONS AND DB STATES 
        //Previous Jbutton
        previousB = new JButton("Previous"); // button with text
        add(previousB); // add plainJButton to JFrame
            // firstDBT JTextField
            firstDBT = new JTextField(first, 1);
            firstDBT.setToolTipText("Current Entry Here -->");
            add(firstDBT); // add textField1 to JFrame
                //of JLable
                ofL = new JLabel("of\n");
                add(ofL); // add label1 to JFrame
            //lastDBT JTextField
            lastDBT = new JTextField(last, 1); 
            lastDBT.setToolTipText("Total Number of entries");
            lastDBT.setEditable(false); // disable editing
            add(lastDBT); // add textField1 to JFrame
        //Next Jbutton
        nextB = new JButton("Next"); // button with text
        add(nextB); // add plainJButton to JFrame
    
         //TOP MIDDLE: CAR DESCRIPTIONS
        //carID JLable
        carIDL = new JLabel("Car ID:");
        carIDL.setToolTipText("You are viewing car #"+id);
        add(carIDL); // add label1 to JFrame
        //carIDT JTextField
            carIDT = new JTextField(id);
            carIDT.setToolTipText("Enter Car ID Here");
            carIDT.setEditable(false); // disable editing
            add(carIDT); // add textField1 to JFrame        
        //carMakeL JLable
        carMakeL = new JLabel("Car Make:");
        carMakeL.setToolTipText("Enter Car Make Here -->");
        add(carMakeL); // add label1 to JFrame
        //carMake JTextField
            carMakeT = new JTextField(car);
            carMakeT.setToolTipText("Enter Car Make Here");
            add(carMakeT); // add textField1 to JFrame
        //carModleL JLable
        carModleL = new JLabel("Car Model:");
        carModleL.setToolTipText("Enter Car Model Here -->");
        add(carModleL); // add label1 to JFrame
        //carID JTextField
            carModelT = new JTextField(model);
            carModelT.setToolTipText("Enter Car Model Here");
            add(carModelT); // add textField1 to JFrame
        //carYearL JLable
        carYearL = new JLabel("Car Year:");
        carYearL.setToolTipText("Enter Car Year Here -->");
        add(carYearL); // add label1 to JFrame
        //carID JTextField
            carYearT = new JTextField(carY);
            carYearT.setToolTipText("Enter Car Year Here");
            add(carYearT); // add textField1 to JFrame
        //carMileage JLable
        carMileageL = new JLabel("Car Mileage:");
        carMileageL.setToolTipText("Enter Car Mileage Here -->");
        add(carMileageL); // add label1 to JFrame
        //carID JTextField
            carMilegeT = new JTextField(carM);
            carMilegeT.setToolTipText("Enter Car Mileage Here");
            add(carMilegeT); // add textField1 to JFrame      
        
         //BOTTOM MIDDLE: FIND FEATURE
        //promptL JLable
        promptL = new JLabel("Find an entry by car model");
        promptL.setToolTipText("Enter Car To Find");
        add(promptL); // add label1 to JFrame
                //carID JTextField
            entryT = new JTextField(21); 
            add(entryT); // add textField1 to JFrame
        //Find Jbutton
        findB = new JButton("Find"); // button with text
        add(findB); // add plainJButton to JFrame    

         //BOTTOM BUTTONS: BROWSE, INSERT, DELETE BUTTONS
        //Browse JButton
            browsB = new JButton("Browse All Entries"); // button with text
            browsB.setToolTipText("Click to browse all entries");
            add(browsB); // add plainJButton to JFrame
        //Insert New Entry Jbutton
            insertB = new JButton("Insert New Entry"); // button with text
            insertB.setToolTipText("Click to Insert Data Inputs Provided Above");
            add(insertB); // add plainJButton to JFrame
        //Delete Current Entry Jbutton
            deleteB = new JButton("Delete Current Entry"); // button with text
            deleteB.setToolTipText("Click to Delete Current Entry");
            add(deleteB); // add plainJButton to JFrame

            
            //FROM BOOK EXAMPLE
      //TEXT LABLES CONSTRUCTED
            // construct textfield with default text
                textField2 = new JTextField(car);
                add(textField2); // add textField2 to JFrame

            // construct textfield with default text and 21 columns
                textField3 = new JTextField("Uneditable text field", 21);
                textField3.setEditable(false); // disable editing
                add(textField3); // add textField3 to JFrame

            // construct passwordfield with default text
                passwordField = new JPasswordField("Hidden text");
                add(passwordField); // add passwordField to JFrame

      // register event handlers
        TextFieldHandler handler = new TextFieldHandler();
            //All JTextField Listeners
            firstDBT.addActionListener(handler);
            lastDBT.addActionListener(handler);
            carIDT.addActionListener(handler);
            carMakeT.addActionListener(handler);
            carModelT.addActionListener(handler);
            carYearT.addActionListener(handler);
            carMilegeT.addActionListener(handler);
            entryT.addActionListener(handler);
            
            //All Button Listeners
      
      //From Original Program
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } // end TextFieldFrame constructor

   // private inner class for event handling
   private class TextFieldHandler implements ActionListener 
   {
      // process textfield events
      @Override
      public void actionPerformed(ActionEvent event)
      {
         String string = ""; 
         // user pressed Enter in JTextField textField1
         if (event.getSource() == carIDT)
            string = String.format("Car ID: %s",
               event.getActionCommand());

         // user pressed Enter in JTextField textField2
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand());

         // user pressed Enter in JTextField textField3
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

         // user pressed Enter in JTextField passwordField
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // display JTextField content
         JOptionPane.showMessageDialog(null, string); 
      } 
   } // end private inner class TextFieldHandler
} // end class TextFieldFrame