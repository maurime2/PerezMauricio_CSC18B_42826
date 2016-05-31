/*
    This Tokenizer class will take the phone number string of format:
    "(XXX)XXX-XXXX" and print it into 3 tokens.

        -Area Code
        -First 3 Digits
        -Last 4 Digits

    We will use regular expressions to acomplish this.
    14.7 and 14.6 were used to acomplish this.
*/


//Libraries
package tokenizingtelnumbs;
import java.util.StringTokenizer;
import java.util.Scanner;

//Class phoneToken
public class phoneToken {
   //Declare variables
    
   //TOKEN SPLIT METHOD
   public void phonePrintTokens(String phoneNumber){
       //Declare Variables
       
       
       //Print out phoneNumber string as tokens
       String[] tokens = phoneNumber.split("\\D");
       
       	System.out.printf("\nNumber of elements: %d%nThe tokens are:%n",
		tokens.length);

        for (String token : tokens)  
        System.out.println(token);
       
       
       
    } 
    
    
}//class PhoneToken end
