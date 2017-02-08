
import java.util.Scanner;
public class Heron{
    public static void main(String[] args){
        public class Iloczyn{
   
        double heron;
        System.out.println("Podaj pierwszy bok trójkąta");
        double a=in.nextDouble();
        System.out.println("Podaj drugi bok trójkąta");
        double b=in.nextDouble();
        System.out.println("Podaj trzeci bok trójkąta");
        double c=in.nextDouble();
         
         if (a +b > c && a+c>b && a+c >a)
         {  System.out.println("Da się zbudować trójkąt");
             double d;
             d=(a+b+c)/2;
             heron=Math.sqrt(d*(d-a)*(d-b)*(d-c));
             System.out.format("Pole trójkąta wynosi "+"%.2f%n", heron);
         }
         else
         System.out.println("Nie da się zbudować trójkąta");
    }
}