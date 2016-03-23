package textfileio;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class TextFileIO {

    public static void main(String[] args) {
        PrintWriter myFile = new PrintWriter(new FileOutputStream("test.txt"));
	myFile.println("Hello There Class!");
	myFile.close();
			
    }
    
}
