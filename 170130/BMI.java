public class BMI{
    public static void main(String[] args){
        if (args.length==0 && args.length >2  )
        {
            System.out.println("błąd danych");
        }
        else { 
            double wzrost= Double.parseDouble ( args[0]);
         double waga=Double.parseDouble (args[1]);
         double bmi;
          bmi= waga/(wzrost*wzrost);
          if ( bmi<18.5)
              System.out.println("Niedowaga :( .Twoje Bmi to "+bmi);
              else if ( bmi >18.5 && bmi<24.99)
              System.out.println("waga prawidłowa :) .Twoje Bmi to "+bmi);
              else 
              System.out.println("nadwaga : ( .Twoje Bmi to "+bmi);
          
          
        }
    }
}
         
        