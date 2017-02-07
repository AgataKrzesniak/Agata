import java.util.Scanner;
public class zad4{
    void cyfry( int x){
        int wynik=0;
        do{

        wynik = x%10;
        System.out.print(wynik+ ", ");
        x /= 10;
        
        }while (x != 0);

    }

    public static void main (String[] args){
      Scanner in=new Scanner(System.in);
        zad4 zad=new zad4();
 System.out.println("Podaj liczbę");
       int x =in.nextInt();
            zad.cyfry(x);
        
    }
}
