import java.util.Scanner;
public class BMI2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int c;
       do{ 
           System.out.println("Podaj wage");
            double waga=in.nextDouble();
            System.out.println("Podaj wzrost");
            double wzrost=in.nextDouble();
          
         double bmi;
          bmi= waga/(wzrost*wzrost);
          if ( bmi<18.5)
              System.out.format("Niedowaga :( .Twoje Bmi to "+"%.2f%n" ,bmi);
              else if ( bmi >18.5 && bmi<24.99)
              System.out.format("waga prawidłowa :) .Twoje Bmi to "+"%.2f%n" ,bmi);
              else 
              System.out.format("nadwaga : ( .Twoje Bmi to "+"%.2f%n" ,bmi);
          
        
                do{ System.out.println("Chcesz kontynuować ? 1-Tak 2-NIE");
        c = in.nextInt();
        }while (c!=1 && c!=2);
       }while (c==1);
    }
}
         
        