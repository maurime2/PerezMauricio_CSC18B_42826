/*
    This Class takes 10 digit phone number and formats it to (XXX)XXX-XXXX
    format.
    
    By this point, NPA and 10 digits have been confirmed in the string. We need 
    to reformat the string to look like (XXX)XXX-XXXX.

        We will remove:
        -SPACES
        -CHARACTERS
        -PUNCTUATION
        
    Once thats done, we will copy the string with parenthasies and its "-" sign
    so that we can manipulate further.

*/

//Libraries
package tokenizingtelnumbs;

//class cleanPhone Start
public class cleanPhone {
    //Declare global variables
    
    //Method Clean String
    public String cleanString(String phoneNum, String cleanPhoneNum){
        //Declare Variables
        String temp = phoneNum;
        
                //Prepare String Array to be manipulated

        temp = temp.replaceAll("[^\\d]", "");   //Removes All Punctuation.
        System.out.println("Fixed String             : "+temp);
        
        
        //Return clean string
        cleanPhoneNum = temp;
        return cleanPhoneNum;
    }
    
    
    
    
}//class cleanPhone end
