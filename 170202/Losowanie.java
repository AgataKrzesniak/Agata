import java.util.Random;
public class Losowanie{
    public static void main (String[] args){
        Random rand= new Random();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (args.length ==2)
        System.out.println(rand.nextInt(b-a+1)+a);
        else 
        System.out.println("Błąd danych");
    }
}