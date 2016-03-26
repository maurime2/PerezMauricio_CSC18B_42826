//Libraries
package morsecode;
import java.util.Scanner;       //This library will alow us to scan into console
//Class MorseCode
public class MorseCode {

    //Main Start
    public static void main(String[] args) {
        //Declare Variables
        Scanner input = new Scanner (System.in);    //creates a scanner "input"
        Boolean loop = false;     //For Selection Loop 
        Boolean morse = false;   //False = Ascii to Morse, True = Morse to Ascii
        String Input;           //Will Hold Inputs Temporarily
        String Original;       //Will Hold Original String
        String Converted;     //Will Hold Converted String
        //Choose Morse or Ascii Input
        do{
        System.out.print("Will You Be Inputing Characters(1) or Morse(2)? ");
        Input=input.nextLine();
        if(Input.charAt(0)== '1' || Input.charAt(0)== '2'){
            //Input is true - Morse to Ascii
            if(Input.charAt(0)== '2'){
                morse = true;
            }
            else{
                morse = false;
            }
            loop = true;
        }//End Choose Morse or Ascii Input
        
        }while(loop == false);
        System.out.println("Your Input is = "+Input);
    
        //Input Ascii to Morse
        if(morse==false){
        System.out.print("\n\nAscii to Morse\n Please input your message to convert to Morse Code: ");
        Input=input.nextLine();
        System.out.println("Your Input is="+Input);
        }
        
        //Input Morse to Ascii
        else if(morse==true){
        System.out.print("\n\nMorse to Ascii\n Please input your message to convert to Morse Code: ");
        Input=input.nextLine();
        System.out.println("Your Input is="+Input);
        }
        
        //Clean Up
            //Ascii to Morse Clean Up
            if(morse==false){
            System.out.print("A-Z,a-z,0-9, and spaces:\n");
            }

            //Morse to Ascii clean up
            else if(morse==true){
            System.out.print("Morse Code only:\n");
            }
        System.out.println("\n\nYour input cleaned up:\n"+Input);
        
    }//Main End
    
}//Class MorseCode End
