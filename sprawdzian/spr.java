import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class spr {
     public static void main (String [] args) throws FileNotFoundException{
        File file=new File ("cyfry.txt");
        Scanner in = new Scanner (file);
        spr funkcje=new spr  ();
        PrintWriter zapis=new PrintWriter ("powt.txt");
        int ile=0;
        while (in.hasNextLine()){
               String text=in.nextLine();
        if (text.length()%2==0) 
        ile=ile+1;
        }     zapis.println("liczb parzystych jest " + ile);
        zapis.close();
}
        
    }