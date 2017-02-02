import java.util.Arrays;
import java.util.Random;
 public class sortuj{
     public static void main (String[] args){
      Random rand= new Random();
      
        int [] b = new int[10];
    for (int i=0; i<10; i++)
    {
         b[i] =rand.nextInt(101)+0;

    }
    Arrays.sort(b);
         System.out.println(Arrays.toString(b));
         System.out.println(b);
 }
 }