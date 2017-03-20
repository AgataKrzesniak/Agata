import java.util.Scanner;
public class systemy2{
    int bintodec(int n) {
    int tekst=0;
    int r=0; 
  while(n>0)
  {
        tekst+=(n%10)*Math.pow(2,r);
        n=n/10;
        r=r+1;
    }
        return tekst; 
    }
    
     public static void main(String [] args){
        systemy2 funkcje=new systemy2();
          Scanner in = new Scanner(System.in);
          System.out.print("Podaj liczbe w systemie binarnym : ");
        int n=in.nextInt();
        System.out.println(funkcje.bintodec(n));
     }
     
    }
    
    