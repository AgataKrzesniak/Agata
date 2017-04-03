import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class sprb {
        int sumacyfr(int n){
        int s=0;
        while(n>0)
        {s=s+n%10;
         n=n/10;    
        }
        return s;
    }
     public static void main (String [] args) throws FileNotFoundException{
        File file=new File ("cyfry.txt");
        Scanner in = new Scanner (file);
        sprb funkcje=new sprb  ();
        PrintWriter zapis2=new PrintWriter ("powtb.txt");
        int liczba=in.nextInt();
        
          int funk=funkcje.sumacyfr(liczba);
          int max=liczba;
          
          while (in.hasNextLine()){
              liczba=in.nextInt();
              if(funkcje.sumacyfr(liczba)>funk)
              {funk=funkcje.sumacyfr(liczba);
              max=liczba;
                  
              }
       
          }
                zapis2.println ("liczba z największa suma cyfr to ; "+ max );
        zapis2. close ();
        
    }
        
}

