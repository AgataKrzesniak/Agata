import java.util.Random;
import java.util.Arrays;
public class funkcje3{
    int [] los(){
        int[] t= new int[10];
        Random rand=new Random();
        for(int i=0; i<10 ; i++)
        { t[i]=rand.nextInt(101)+0;}
        return t;
    } 
      void pierwsza(int[] t ) {
          boolean pierwsza=true;
for(int i=0; i<t.length; i++){
    for (int j=2; j*j<t.length; j++)
    if(t[i]%j==0)
    pierwsza=false;
    else
    pierwsza = true;
    if(pierwsza)
   System.out.println(t[i] +" liczba pierwsza");
  else
   System.out.println(t[i] +" liczba złożona");
}
      }
    public static void main (String[] args){
   funkcje3 funk=new funkcje3();
       funk.pierwsza(funk.los());

            
    }
}