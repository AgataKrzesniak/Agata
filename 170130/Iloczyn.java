public class Iloczyn{
    public static void main(String[] args){
        if (args.length == 0)
        {
            System.out.println("błąd danych");
        }else
        {
        double a=1;
        for ( int i=0; i <args.length ; i++)
        {
            a=a*Double.parseDouble(args[i]);
        }
         System.out.format("%.2f%n", a);
         System.out.println("iloczyn podanych przez Ciebie liczb wynosi "+ a);
            
        }
    }
}