package button.layout.app;
import javax.swing.*;

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
        
        String [] carIDA = new String []{"1","2","3"};
        String [] carMakeA = new String []{"Honda","Honda","Nissan"};
        String [] carModelA = new String []{"Civic","Accord","Pickup"};
        String [] carYearA = new String []{"1998","2009","1997"};
        String [] carMileageA = new String []{"135647","46877","235444"};
        int count = carIDA.length;
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
                    
                    
                bottomP.add(browse, BorderLayout.NORTH);
                bottomP.add(insert, BorderLayout.NORTH);
                bottomP.add(delete, BorderLayout.SOUTH);
                thePanel.add(bottomP, BorderLayout.SOUTH);
                
        
        
        
        
                this.add(thePanel); // Don't use for BOX LAYOUT
        
                this.setVisible(true);
    }
    
    
}
