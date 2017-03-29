import java.util.Scanner; 
public class zadanie1 {
    String  dectobin (int n ){
    String tekst="";
        while(n>0)
        { 
            tekst=tekst+((char)(n%2+48));
            n=n/2;    
        }
        
         String reverse=new StringBuffer(tekst).reverse().toString();  
         return reverse;
    }
    int ile(String n){
    int wynik=0;
        for (int i=0; i<n.length(); i++)
      {  if (n.charAt(i)=='1')
        wynik++;
      }
       return wynik;
}



public static void main ( String [] args){
    zadanie1 zad=new zadanie1();
        String n= zad.dectobin(3600);
        System.out.println(n);
        System.out.println(zad.ile(n));


}   
}