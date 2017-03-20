import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
import java.io.PrintWriter; 

public class liczby {
    int sumacyfr(int n){
        int s=0; 
        while(n>0){
            s=s+n%10;
            n=n/10;
        } return s; 
        
    }
   String dectocz(int n){
        String tekst=""; 
        
        while (n>0){
            tekst=tekst+((char)(n%4+48));
            n=n/4;
        }
        String reverse=new StringBuffer(tekst).reverse().toString();  
        return reverse; 
    }
    
    public static void main (String[] args )throws FileNotFoundException {
        File file= new File ("liczby.txt");
         Scanner in=new Scanner(file) ;
        liczby funkcje= new liczby ();
          PrintWriter zapis = new PrintWriter ( "wyniki.txt");
        int liczba=in.nextInt();
        
          int funk=funkcje.sumacyfr(liczba);
          int max=liczba;
          
          while (in.hasNextLine()){
              
 zapis.println(liczba+" "+ funkcje.dectocz(liczba));
              liczba=in.nextInt();
              if(funkcje.sumacyfr(liczba)>funk)
              {funk=funkcje.sumacyfr(liczba);
              max=liczba;
                  
              }
       
          }
        
        zapis.println(liczba+" "+ funkcje.dectocz(liczba));
        zapis.println ("liczba z największa suma cyfr to ; "+ max );
        zapis. close ();
        
    }
        
    }

