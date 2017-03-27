import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class hasla {
    public static void main (String [] args) throws FileNotFoundException{
        File file=new File ("hasla.txt");
        Scanner in = new Scanner (file);
        hasla funkcje=new hasla ();
        PrintWriter zapis=new PrintWriter ("wynik4a.txt");
        int ilep=0; 
        int ilen=0;
     
        while(in.hasNextLine()){
         String text=in.nextLine();
        if (text.length()%2==0) 
        ilep=ilep+1;
         else 
         ilen=ilen+1;
         
 
        }
      zapis.println("parzystych jest " + ilep + " a nieparzystych "+ilen);
        zapis.close();
        PrintWriter zapis2= new PrintWriter("wynik4b.txt");
         
         while (in.hasNextLine()){
             String text=in.nextLine();
             for (int i=0; i<text.length(); i++)
             for (int j=text.length(); j<0; j--) 
             
         }
        
}
}