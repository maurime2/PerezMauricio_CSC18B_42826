package button.layout.app;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;
public class ButtonLayoutApp extends JFrame{
	
    //Buttons
        JButton previous, next, find, browse, insert, delete;
        JButton button1, button2, button3, button4, button5;
	String outputString = "";
        JLabel carIDL, carMakeL, carModelL, carYearL, carMileageL, ofL;
        JTextField firstDBT,lastDBT, carIDT, carMakeT, carModelT, carYearT, carMileageT, entryT;
        
    public static void main(String[] args) {
              
        new ButtonLayoutApp();
        
        
    }
    
    
    public ButtonLayoutApp(){

        this.setSize(400,400);
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
                 ofL = new JLabel(" of "); // JLabel with just text
                 carIDL = new JLabel("Car ID:"); // JLabel with just text
                 carMakeL = new JLabel("Car Make:"); // JLabel with just text
                 carModelL = new JLabel("Car Model:"); // JLabel with just text
                 carYearL = new JLabel("Car Year:"); // JLabel with just text
                 carMileageL = new JLabel("Car Mileage:"); // JLabel with just text
                 
                 //Text Lables
                 firstDBT = new JTextField("");
                 lastDBT = new JTextField("");
                 carIDT = new JTextField("");
                 carMakeT = new JTextField("");
                 carModelT = new JTextField(""); 
                 carYearT = new JTextField("");
                 carMileageT = new JTextField("");
                 entryT = new JTextField("");
                
                 //Locations
                JPanel topP = new JPanel();    //\\TOP
                JPanel centerP = new JPanel();  //\\Center top
                JPanel centerP1 = new JPanel();  //\\Center top
                JPanel centerP2 = new JPanel();  //\\Center top
                JPanel centerP3 = new JPanel();  //\\Center top
                JPanel centerP4 = new JPanel();  //\\Center top
                JPanel centerP5 = new JPanel();  //\\Center top
                JPanel centerP6 = new JPanel();  //\\Center top
                JPanel centerTP = new JPanel();   //Center Bottom
                JPanel centerBP = new JPanel();  //Center Bottom Objects
                JPanel bottomP = new JPanel();  //Bottom
                
                //Top Pannel
                topP.add(previous, BorderLayout.NORTH);
                topP.add(firstDBT, BorderLayout.NORTH);
                topP.add(ofL, BorderLayout.NORTH);
                topP.add(lastDBT, BorderLayout.NORTH);
                topP.add(next, BorderLayout.NORTH);
                thePanel.add(topP, BorderLayout.NORTH);
                 
                 //Center Pannel
                    //Center Top
                        centerP1.add(carIDL, BorderLayout.EAST);
                        centerP1.add(carIDT, BorderLayout.WEST);
                        centerP2.add(carMakeL, BorderLayout.EAST);
                        centerP2.add(carMakeT, BorderLayout.WEST);
                        centerP3.add(carModelL, BorderLayout.EAST);
                        centerP3.add(carModelT, BorderLayout.WEST);
                        centerP4.add(carYearL, BorderLayout.EAST);
                        centerP4.add(carYearL, BorderLayout.WEST);
                        centerP5.add(carMileageL, BorderLayout.EAST);
                        centerP5.add(carMileageT, BorderLayout.WEST);
                        
                        
                        centerP.add(centerP1, BorderLayout.NORTH);
                        centerP.add(centerP2, BorderLayout.NORTH);
                        centerP.add(centerP3, BorderLayout.NORTH);
                        centerP.add(centerP4, BorderLayout.NORTH);
                        centerP.add(centerP5, BorderLayout.NORTH);
                        
                        //Center Bottom
                        centerP6.add(find, BorderLayout.SOUTH);
                        centerP.add(centerP6, BorderLayout.SOUTH);
                    //Add Center Panel to Main Panel
                    thePanel.add(centerP, BorderLayout.CENTER);
                    
                    
                bottomP.add(browse, BorderLayout.NORTH);
                bottomP.add(insert, BorderLayout.NORTH);
                bottomP.add(delete, BorderLayout.NORTH);
                thePanel.add(bottomP, BorderLayout.SOUTH);
                
        
        
        
        
                this.add(thePanel); // Don't use for BOX LAYOUT
        
                this.setVisible(true);
    }
    
    
}
