/*
Mauricio S. Perez
CSC 18B 42826 - Java Advanced Objects
Redo - 5/30/2016

14.8 - Tokenizing Telephone Numbers

Write an application that inputs a telephone number as a string in the form of
(555) 555-5555. 

-	The application should use the String class method split to extract:
		* the area code as a token
		* the first three digits of the phone number as a token
		* the last four digits of the phone number as a token.
		
	The seven digits of the phone number should be concatenated into one string. 
	Both the area code and the phone number should be printed. Remember that you 
	will need to change the delimiter characters during the tokenization process.
*/

//Libraries
package tokenizingtelnumbs;
import java.util.Scanner;       //This library will alow us to scan into console

//TokenizingTelNumbs Class Start
public class TokenizingTelNumbs {
    
    //Main Start
    public static void main(String[] args) {
        //Declare Local Variables
        Scanner input = new Scanner (System.in);    //creates a scanner "input"
        String phoneNumbOrig;                      //This Will store the 
                                                    //original Phone Number from 
                                                   //the user
        String phoneNumbClean = null;  //Cleaned up version of original Pohone Number
                                        //to look like "(XXX)XXX-XXXX" format
        String areaCode=null;      //Area Code NPA
        String phoneP1=null;      //First 3 Digits of Phone Number
        String phoneP2=null;     //Last 4 DIgits of Phone Number
        boolean valid = false;   //Valid or invalid phone number
        boolean vNPA = false;
        
        //Declare Objects
        npaCheck npaObject = new npaCheck();
        gThanTen gThanTenObject = new gThanTen();
        cleanPhone cleanPhoneObject = new cleanPhone();
        phoneToken phoneTokenPhoneObject = new phoneToken();
        
        //Prompt User For Phone Number untill valid:
        do{
            //Input Number   
            do{
            System.out.print("Input a Phone Number: (xxx) xxx - xxxx: ");
            phoneNumbOrig=input.nextLine();
            System.out.println("You Input: "+phoneNumbOrig );
        
            //Check that first digit is not a 0 or a 1 in the NPA
            vNPA = npaObject.firstDigit(phoneNumbOrig, vNPA);
            }while(vNPA==false);
            
            //NPA VALID Confirmed
            System.out.println("NPA not 0 or 1 \n");
            
            //Check for atleast 10 digits
            valid = gThanTenObject.tenDigit(phoneNumbOrig, valid);
            
            
        }while(valid==false);
        
        //10 Digits VALID Confirmed
        System.out.println("There are 10 digits in your phone number\n");
        
        //CLEAN THE STRING
        phoneNumbClean = cleanPhoneObject.cleanString(phoneNumbOrig, phoneNumbClean);
        
        
        //RETURN string as (XXX)XXX-XXXX format, store in phoneNumbClean
        System.out.println("Your Phone Number is: "+ phoneNumbClean);
        
        //Return as tokens:
        phoneTokenPhoneObject.phonePrintTokens(phoneNumbClean);
        
    }//Main End
    
}//End TokenizingTelNumbs Class
