 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class sprc {
 String dectobin(int n){
String tekst="";
        while(n>0)
        { 
            tekst=tekst+((char)(n%2+48));
            n=n/2;    
        }
        
         String reverse=new StringBuffer(tekst).reverse().toString();  
        return reverse; }
        public static void main (String [] args) throws FileNotFoundException{
        File file=new File ("cyfry.txt");
        Scanner in = new Scanner (file);
        sprc funkcje=new sprc  ();
        PrintWriter zapis3=new PrintWriter ("powtc.txt");
        while (in.hasNextLine()) {
            String text= in.nextLine();
            if ( Integer.parseInt(text) <10000)
            {  
                zapis3.println(text + " "+ funkcje.dectobin(Integer.parseInt(text)));
            }
            
        }
            zapis3.close();
        }
}
