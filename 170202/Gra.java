
import java.util.Random;
public class Gra{
    public static void main (String[] args){
        Random rand = new Random();
         int a= rand.nextInt(2)+0 ; 
         int b=Integer.parseInt(args[0]);
            if (b==0 || b==1 && args.length==1)
            {
                if(a==b)
                {
                    System.out.println("Wygrałeś!!! ");
                }
                else 
                System.out.println("przegrałeś :(");
            }
            else 
            System.out.println("błąd danych");
            

}
}