package button.layout.app;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;
public class ButtonLayoutApp extends JFrame{
	
        //JButtons
        JButton previous, next, find, browse, insert, delete;
        JButton button1, button2, button3, button4, button5;
        //JLables
        JLabel carIDL, carMakeL, carModelL, carModelL2, carYearL, carMileageL, ofL, prompt;
        //JTextField
        JTextField firstDBT,lastDBT, carIDT, carMakeT, carModelT, carYearT, carMileageT, entryT;
        

        
        //Arrays
        
        String [] carIDA = new String []{"1","2","3","","","","","","",""};
        String [] carMakeA = new String []{"Honda","Honda","Nissan","","","","","","",""};
        String [] carModelA = new String []{"Civic","Accord","Pickup","","","","","","",""};
        String [] carYearA = new String []{"1998","2009","1997","","","","","","",""};
        String [] carMileageA = new String []{"135647","46877","235444","","","","","","",""};
        int count = 3;
        int location0 = 0;
        
        //Strings
        String first = Integer.toString(location0+1);
        String last  = Integer.toString(count);
        String id    = carIDA[location0];
        String car   = carMakeA[location0];
        String model = carModelA[location0];
        String carY  = carYearA[location0]; 
        String carM  = carMileageA[location0];
        
    //Main Start
    public static void main(String[] args) {
        //Declare Variables
        
        //Start App
        new ButtonLayoutApp(); 
    }//Main End
    
    
    public ButtonLayoutApp(){

        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cars");

                // Create a flow layout (Default)
                JPanel thePanel = new JPanel();
                thePanel.setLayout(new BorderLayout());
		
		//Button Creations
		 previous = new JButton("Previous");
                 next = new JButton("Next");
                 find = new JButton("Find");
                 browse = new JButton("Browse All Entries");
                 insert = new JButton("Insert New Entry");
                 delete = new JButton("Delete Current Entry");
                 
                 //Lables Created
                 ofL = new JLabel(" of ",10); // JLabel with just text
                 carIDL = new JLabel     ("Car ID:               ",10); // JLabel with just text
                 carMakeL = new JLabel   ("Car Make:             ",10); // JLabel with just text
                 carModelL = new JLabel  ("Car Model:            ",10); // JLabel with just text
                 carModelL2 = new JLabel  ("Car Model:            ",10); // JLabel with just text
                 carYearL = new JLabel   ("Car Year:             ",10); // JLabel with just text
                 carMileageL = new JLabel("Car Mileage:          ",10); // JLabel with just text
                 prompt = new JLabel("Find an entry by car model:           ",10); // JLabel with just text
                 
                 
                 //Text Lables
                 firstDBT = new JTextField(first, 1);
                 lastDBT = new JTextField(last, 1);
                 carIDT = new JTextField(id, 15);
                 carMakeT = new JTextField(car, 15);
                 carModelT = new JTextField(model,15); 
                 
                 carYearT = new JTextField(carY,15);
                 carMileageT = new JTextField(carM,15);
                 entryT = new JTextField(" ", 15);
                
                 //Locations
                JPanel topP = new JPanel();    //\\TOP
                JPanel centerP = new JPanel();  //\\Center top
                JPanel centerP1 = new JPanel();  //\\Center top
                JPanel centerP2 = new JPanel();  //\\Center top
                JPanel centerP3 = new JPanel();  //\\Center top
                JPanel centerP4 = new JPanel();  //\\Center top
                JPanel centerP5 = new JPanel();  //\\Center top
                JPanel centerP6 = new JPanel();  //\\Center top
                JPanel centerP7 = new JPanel();  //\\Center top
                JPanel centerTP = new JPanel();   //Center Bottom
                JPanel centerBP = new JPanel();  //Center Bottom Objects
                JPanel bottomP = new JPanel();  //Bottom
                
                    //Top Pannel
                    topP.add(previous,  BorderLayout.NORTH);
                    topP.add(firstDBT,  BorderLayout.NORTH);
                    topP.add(ofL,       BorderLayout.NORTH);
                    topP.add(lastDBT,   BorderLayout.NORTH);
                    topP.add(next,      BorderLayout.NORTH);
                    thePanel.add(topP,  BorderLayout.NORTH);
                 
                    //Center Pannel
                       //Center Top
                           centerP1.add(carIDL, BorderLayout.CENTER);
                           centerP1.add(carIDT, BorderLayout.CENTER);
                           centerP2.add(carMakeL, BorderLayout.CENTER);
                           centerP2.add(carMakeT, BorderLayout.CENTER);
                           centerP3.add(carModelL, BorderLayout.CENTER);
                           centerP3.add(carModelT, BorderLayout.CENTER);
                           centerP4.add(carYearL, BorderLayout.CENTER);
                           centerP4.add(carYearT, BorderLayout.CENTER);
                           centerP5.add(carMileageL, BorderLayout.CENTER);
                           centerP5.add(carMileageT, BorderLayout.CENTER);

                           //Car ID - car Mileage Added to center
                           centerP.add(centerP1, BorderLayout.NORTH);
                           centerP.add(centerP2, BorderLayout.NORTH);
                           centerP.add(centerP3, BorderLayout.NORTH);
                           centerP.add(centerP4, BorderLayout.NORTH);
                           centerP.add(centerP5, BorderLayout.NORTH);

                           //Center Bottom : FIND ENTRY BY CAR MODEL BOX
                           centerP7.add(prompt, BorderLayout.NORTH);
                           centerP6.add(carModelL2, BorderLayout.WEST);
                           centerP6.add(entryT, BorderLayout.CENTER);
                           centerP6.add(find, BorderLayout.EAST);
                           centerP.add(centerP7, BorderLayout.WEST);
                           centerP.add(centerP6, BorderLayout.SOUTH);
                            
                            //Add Center Panel to Main Panel
                            thePanel.add(centerP, BorderLayout.CENTER);
                    
                            //Add all bottom buttons to bottom panel
                            bottomP.add(browse, BorderLayout.NORTH);
                            bottomP.add(insert, BorderLayout.NORTH);
                            bottomP.add(delete, BorderLayout.SOUTH);
                            //Add Bottom Panel to Main Panel
                            thePanel.add(bottomP, BorderLayout.SOUTH);
                
            // register event handlers
            TextFieldHandler handler = new TextFieldHandler();
            //All JTextField Listeners
            firstDBT.addActionListener(handler);     //WHENEVER ANY OF THESE
            lastDBT.addActionListener(handler);     //CHANGE, OR IS ACTIVATED, 
            carIDT.addActionListener(handler);     //PROMPT WILL ASK TO CHANGE 
            carMakeT.addActionListener(handler);    //VALUES
            carModelT.addActionListener(handler);
            carYearT.addActionListener(handler);
            carMileageT.addActionListener(handler);
            entryT.addActionListener(handler);
            //Button JButton Listeners
            previous.addActionListener(handler);
            next.addActionListener(handler);
            find.addActionListener(handler);
            browse.addActionListener(handler);
            insert.addActionListener(handler);
            delete.addActionListener(handler);
            
            //Tool Tips
            
            //Non Editable
            lastDBT.setEditable(false);
            carIDT.setEditable(false);
            
            //Show Panel
            this.add(thePanel); // Don't use for BOX LAYOUT
            this.setVisible(true);
    }
    
    // private inner class for event handling
   private class TextFieldHandler implements ActionListener 
   {
      // process textfield events
      @Override
      public void actionPerformed(ActionEvent event)
      {
         String string = ""; 
            //LABLES
            
            //Number Changed
            if ( (event.getSource() == firstDBT) || event.getSource() == previous || event.getSource() == next ){
                

                //CLEAN UP NON NUMERIC VALUES
                String test = firstDBT.getText();     //THIS WILL EXCLUDE
                test = test.replaceAll("[^0-9]","");    //ALL NON NUMERIC VALUES
                if(test.matches("")){                   //WILL USE the Number 1
                    System.out.println("TEST WORKS");   //When no numbers are
                    test = "1";                         //Present
                }
                //Output should be clean integer
                int input = Integer.parseInt(test);
                System.out.println(input);
                //If Previous Button Pressed
                if(event.getSource() == previous){
                    input--;
                }
                
                //If Next Button Pressed
                if(event.getSource() == next){
                    input++;
                }
                
                //Too Big, Loop Around
                if(input>count){
                    input=count;
                    System.out.println("Too Big, Set to : "+ input);
                }
                //Too Small
                else if(input<1){
                    input=1;
                System.out.println("Too small, Set to: " + input);
                
                
                }
                else{
                    input=input;
                    
                System.out.println("Will set ID to: "+input);
                }

                //Change values according to new ID
                first = Integer.toString(input);
                id    = carIDA[input-1];
                car   = carMakeA[input-1];
                model = carModelA[input-1];
                carY  = carYearA[input-1];          //THIS CHANGES TEXT IN 
                carM  = carMileageA[input-1];   //TEXT LABLES ACCORDING TO TEXT
                //Set Text                      //IN FirstDTB
                    firstDBT.setText(first);
                    carIDT.setText(id);
                    carMakeT.setText(car);
                    carModelT.setText(model);
                    carYearT.setText(carY);
                    carMileageT.setText(carM);
                 
                
                
                string = String.format("Car ID: %s", test);        
            }
            
            else if (event.getSource() == carMakeT){
            string = String.format("Car Make is: %s",event.getActionCommand());
            }
            
            else if (event.getSource() == carModelT){
            string = String.format("Car Model is: %s",event.getActionCommand());
            }
            
            else if (event.getSource() == carYearT){
            string = String.format("Car Year is: %s",event.getActionCommand());
            }
            
            else if (event.getSource() == carMileageT){
            string = String.format("Car Mileage is: %s",event.getActionCommand());
            }
            
            //Find Button Pressed Or Find Prompt Entered
            else if (event.getSource() == find || event.getSource() == entryT){
            string = String.format("Find all: %s",entryT.getText());
                
            System.out.printf("FIND: %s\n",entryT.getText());
                //Display All
                int disp = 0;
                String compare1 = entryT.getText().toString().toLowerCase();
                String compare2 = carMakeA[0].toString().toLowerCase();
                String compare3 = carModelA[0].toString().toLowerCase();
                String compare4 = carYearA[0].toString().toLowerCase();
                String compare5 = carMileageA[0].toString().toLowerCase();
                
                System.out.println("ID         "+"Make         "+"Model           "+"Year     "+"Mileage");
                for(int i=0;i<count;i++){
                compare2 = carMakeA[i].toString().toLowerCase();
                compare3 = carModelA[i].toString().toLowerCase();
                compare4 = carYearA[i].toString().toLowerCase();
                compare5 = carMileageA[i].toString().toLowerCase();
                
                   //COMPARE STRINGS FROM CONTENTS OF FIND TEXT BOX TO CONTENTS OF ARRAYS
                   //System.out.println(compare1+"??"+compare2+".."+compare1.matches(compare2)); //THIS TEST TOOK ME FOREVER TO VALIDATE!!!!
                    if( (compare1.matches(compare2))||(compare1.matches(compare3))||(compare1.matches(compare4))||(compare1.matches(compare5)) ){
                            
                            //(compare1 == compare2) || (compare1.equalsIgnoreCase(compare3)) || (compare1.equalsIgnoreCase(compare4)) || (compare1.equalsIgnoreCase(compare5))  ){
                    System.out.println((i+1)+"          "+carMakeA[i]+"         "+carModelA[i]+"          "+carYearA[i]+"         "+carMileageA[i] );
                    }
                disp++;
                }
            
            }
            
            //Browse All
            else if (event.getSource() == browse){
            string = String.format("Here Are all the Entrys:");
            System.out.println("BROWSE ALL:\n");
                //Display All
                int disp = 0;
                System.out.println("ID         "+"Make         "+"Model           "+"Year     "+"Mileage");
                for(int i=0;i<count;i++){
                System.out.println((i+1)+"          "+carMakeA[i]+"         "+carModelA[i]+"          "+carYearA[i]+"         "+carMileageA[i] );
                disp++;
                }
            }
            
            //Insert
            else if (event.getSource() == insert){
            string = String.format("Inserting new Entry at ID:"+(count+1));
            
            //Insert New Entrys
            }
            
            else if (event.getSource() == delete){
            string = String.format("Delete Current Entry: %s",firstDBT.getText());
                                //Change values according to new ID

                //Set Text                      //IN FirstDTB
                    firstDBT.setText(null);
                    
                    carIDT.setText(null);
                    carMakeT.setText(null);
                    carModelT.setText(null);
                    carYearT.setText(null);
                    carMileageT.setText(null);
                    
                    /*
                    carIDA = new String []{"1","2","3","","","","","","",""};
                    carMakeA = new String []{"Honda","Honda","Nissan","","","","","","",""};
                    carModelA = new String []{"Civic","Accord","Pickup","","","","","","",""};
                    carYearA = new String []{"1998","2009","1997","","","","","","",""};
                    carMileageA = new String []{"135647","46877","235444","","","","","","",""};
                    */
                    if(count>0){
                        lastDBT.setText(Integer.toString(count-1));
                    count--;
                    }
                    else{
                        string = "Nothing to Delete";
                    System.out.println("Nothing to Delete");
                    JOptionPane.showMessageDialog(null, string); 
                    }
            }
            
         // display JTextField content
         //JOptionPane.showMessageDialog(null, string); 
      } 
    
    
}//End Text Field Handler
   
}//End Class ButtonLayoutApp
