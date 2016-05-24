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
        String Converted = "";     //Will Hold Clean String
        String Converted0 = "";    //Will Hold Temp 5 Count Morse Code
        String Converted2 = "";   //Will Hold Converted/Concatinated String
        String Temp = "";        //Place holder to concatinate to
        int Value = 0;
        int length = 0;
        char aChar = 0;
        
        //Morse Code Strings
        String[] MC = new String[38];
        MC[1] =	".-";        MC[2] = "-...";    MC[3] = "-.-."; //ABC
        MC[4] =	"-..";       MC[5] = ".";       MC[6] =	"..-."; //DEF
        MC[7] =	"--.";       MC[8] = "....";    MC[9] =	"..";   //GHI
        MC[10] =".---";      MC[11] ="-.-";     MC[12] =".-.."; //JKL
        MC[13] ="--";        MC[14] ="-.";      MC[15] ="---";  //MNO
        MC[16] =".--.";      MC[17] ="--.-";    MC[18] =".-.";  //PQR
        MC[19] ="...";       MC[20] ="-";       MC[21] ="..-";  //STU
        MC[22] ="...-";      MC[23] =".--";     MC[24] ="-..-"; //VWX
        MC[25] ="-.--";      MC[26] ="--..";    MC[27] ="-----";//YZ0
        MC[28] =".----";     MC[29] ="..---";   MC[30] ="...--";//123
        MC[31] ="....-";     MC[32] =".....";   MC[33] ="-....";//456
        MC[34] ="--...";     MC[35] ="---..";   MC[36] ="----.";//789
        MC[0] ="  ";         MC[37] =" ";       //Space Double Space Single
        
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
        System.out.print("\nMorse to Ascii\n Please input your message to convert to Ascii: ");
        System.out.print("\n(Please input a space inbetween letters, and 3 spaces inbetween words.)");
        System.out.print("\n(Max dashes and periods of 5, anything bigger will be ignored.)");
        Original=input.nextLine();
        System.out.println("Your Input is="+Original);
        }
        
        //Clean Up
        System.out.print("\nClean Up\n");
        
            //Ascii to Morse Clean Up
            if(morse==false){
            System.out.print("Allow Message to only accept a-z,0-9.");
               Converted = Original.toUpperCase();//Converts All to Lowercase.
               Converted = Converted.replaceAll("[^0-9A-Z ]","");//-Punctuation.
            }

            //Morse to Ascii clean up
            else if(morse==true){
            System.out.print("Allow Message to only accept Morse Code.\n");
               Converted = Original.replaceAll("[^ ^.^-]","");//-Punctuation.
               //length = Converted.length();
               //Clean up Morse Code letters bigger than 5
               for(int m=0;m<Converted.length();m++){
                   
                    //5 Left
                   if(m+5<=Converted.length()){
                   for(int n=0;n<5;n++){
                       System.out.print(m+": ");
                       aChar = Converted.charAt(m);
                       System.out.print(aChar); 
                       m++;
                       if(aChar==' '){
                       m=5;
                       }
                       Converted0 = Converted0 + aChar;
                       System.out.println("c0 : "+Converted0);
                   }//End For Loop
                    //Concatinate Letter
                   }//End if statement
                   
                   //4 Left
                   if(m+4<=Converted.length()){
                   for(int n=0;n<4;n++){
                       System.out.print(m+": ");
                       aChar = Converted.charAt(m);
                       System.out.print(aChar); 
                       m++;
                       if(aChar==' '){
                       m=4;
                       }
                       Converted0 = Converted0 + aChar;
                       System.out.println("c0 : "+Converted0);
                   }//End For Loop
                    //Concatinate Letter
                   }//End if statement
                   
                   //3 Left
                   if(m+3<=Converted.length()){
                   for(int n=0;n<3;n++){
                       System.out.print(m+": ");
                       aChar = Converted.charAt(m);
                       System.out.print(aChar); 
                       m++;
                       if(aChar==' '){
                       m=3;
                       }
                       Converted0 = Converted0 + aChar;
                       System.out.println("c0 : "+Converted0);
                   }//End For Loop
                    //Concatinate Letter
                   }//End if statement

                   //2 Left
                   if(m+2<=Converted.length()){
                   for(int n=0;n<2;n++){
                       System.out.print(m+": ");
                       aChar = Converted.charAt(m);
                       System.out.print(aChar); 
                       m++;
                       if(aChar==' '){
                       m=2;
                       }
                       Converted0 = Converted0 + aChar;
                       System.out.println("c0 : "+Converted0);
                   }//End For Loop
                    //Concatinate Letter
                   }//End if statement
                   
                   //One Left
                   if(m+1<=Converted.length()){
                   for(int n=0;n<1;n++){
                       System.out.print(m+": ");
                       aChar = Converted.charAt(m);
                       System.out.print(aChar); 
                       m++;
                       if(aChar==' '){
                       m=1;
                       }
                       Converted0 = Converted0 + aChar;
                       System.out.println("c0 : "+Converted0);
                   }//End For Loop
                    //Concatinate Letter
                   }//End if statement
                    if(m<=Converted.length()){
                        m = Converted.length();
                    }

               }//Clean Up Loop
            }//Clean Up End
        //Clean String to Convert
        System.out.println("\nYour new cleaned up String is: "+Converted);
        length = Converted.length();
        
        //Conversion
            //Ascii to Morse Code
            if(morse==false){
            System.out.println("\nThe Following will be converted to Morse Code: "+Converted);
                //Convert and Concatinate new String
                for(int i=0;i<length;i++){
                    Value = Converted.charAt(i);
                    System.out.print("\n"+i+": "+Value);
                    //Check Space
                    if(Value==32){
                       System.out.print(" "+MC[0]);
                       Converted2 = Converted2 + MC[0];
                       Converted2 = Converted2 + MC[37];
                    }
                    //A-Z
                    else if(Value>=65){
                        System.out.print(" "+MC[Value-64]);
                        Converted2 = Converted2 + MC[Value-64];
                        Converted2 = Converted2 + MC[37];
                    }
                    //'Space'
                    else{
                        System.out.print(" "+MC[Value-21]);
                        Converted2 = Converted2 + MC[Value-21];
                        Converted2 = Converted2 + MC[37];
                    }
                    
                }
            }

            //Morse Code to Ascii
            else if(morse==true){
            System.out.println("\nThe Following will be converted to Ascii Characters: "+Converted);
            Converted2="";
            Converted0="";
            for(int c=0;c<Converted.length();c++){
                aChar = Converted.charAt(c);
                //System.out.println(aChar);
                if(aChar ==' '){
                    for(int d=37;d<37;d++){
                        Temp = MC[d];
                      if(Converted0 == Temp){
                      System.out.println("Thats A Hit");
                      Value = d;
                      }  
                      
                    }
                    Value = Value+37;
                    
                   aChar = (char)Value;
                   System.out.println(aChar);
                   Converted2 = Converted2 + aChar;
                   Converted2 = Converted2 + MC[0];
                   Converted0 = "";
                }
                else{
                Converted0 = Converted0 + aChar;
                System.out.println("C0: "+Converted0);
                
                }
                
                
            }//End of Concatination Loop
            
                Converted0 = Converted0 + aChar;
                System.out.println("C0: "+Converted0);
            }
            
            
            //Final COncatinated String
            System.out.println("\nThe Final Message is: "+Converted2);
    }//Main End
    
}//Class MorseCode End
