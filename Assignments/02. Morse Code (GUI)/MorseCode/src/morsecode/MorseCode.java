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
        String Input = "";           //Will Hold Inputs Temporarily
        String Original = "";       //Will Hold Original String
        String Converted = "";     //Will Hold Converted String
        //Choose Morse or Ascii Input
        do{
        System.out.print("Will You Be Inputing Characters(1) or Morse(2)? ");
        Input=input.nextLine();
        if(Input.charAt(0)== '1' || Input.charAt(0)== '2'){
            //Input is true - Morse to Ascii
            if(Input.charAt(0)== '2'){
                morse = true;   //Morse to Ascii
            }
            else{
                morse = false; //Ascii to Morse
            }
            loop = true;
        }//End Choose Morse or Ascii Input
        
        }while(loop == false);
        
        System.out.println("Your Input is = "+Input);
        
    
        //Input Ascii to Morse
        if(morse==false){
        System.out.print("\nAscii to Morse\n Please input your message to convert to Morse Code: ");
        Original=input.nextLine();
        System.out.println("Your Input is="+Original);
        }
        
        //Input Morse to Ascii
        else if(morse==true){
        System.out.print("\nMorse to Ascii\n Please input your message to convert to Morse Code: ");
        Original=input.nextLine();
        System.out.println("Your Input is="+Original);
        }
        
        //Clean Up
        System.out.print("\nClean Up\n");
        
            //Ascii to Morse Clean Up
            if(morse==false){
            System.out.print("Allow Message to only accept a-z,0-9.");
               Converted = Original.toLowerCase();//Converts All to Lowercase.
               Converted = Converted.replaceAll("[^0-9a-z ]","");//-Punctuation.
            }

            //Morse to Ascii clean up
            else if(morse==true){
            System.out.print("Allow Message to only accept Morse Code.");
               Converted = Original.replaceAll("[^ ^.^-]","");//-Punctuation.
            }
        //Clean String to Convert
        System.out.println("\nYour new cleaned up String is: "+Converted);
        
    }//Main End
    
}//Class MorseCode End
