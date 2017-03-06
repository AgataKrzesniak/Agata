public class systemy {
    String dectobin(int n){
String tekst="";
        while(n>0)
        { 
            tekst=tekst+((char)(n%2+48));
            n=n/2;    
        }
        
        // String reverse=new StringBuffer(tekst).reverse().toString();  
      String reverse =""; 
for ( int i=tekst.length()-1; i>= 0; i--)
reverse = reverse+tekst.charAt(i);
        return reverse; 
    }
    public static void main (String []args){
        systemy funkcje=new systemy(); 
        System.out.println(funkcje.dectobin(1975));
    }
}