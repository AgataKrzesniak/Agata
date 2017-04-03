 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class sprd {
    boolean malejaca(int n ){
        int ost= n%10;
        int post;
        n=n/10;
        while (n>0){
            post= n%10;
            if(post<=ost) return false; 
            n=n/10;
            ost=post;
        }
        return true;
    }
            public static void main (String [] args) throws FileNotFoundException{
        File file=new File ("cyfry.txt");
        Scanner in = new Scanner (file);
        sprd funkcje=new sprd  ();
        PrintWriter zapis4=new PrintWriter ("powtd.txt");
        while (in.hasNextLine()){
            String text=in.nextLine();
             int liczba=Integer.parseInt(text);
              if (funkcje.malejaca(liczba)==true) zapis4.println(liczba);
        }
        zapis4.close();
            }
}
