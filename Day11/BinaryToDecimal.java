import java.util.*;
public class BinaryToDecimal{
    public static void bintodeci(int n){
        int pow = 0;
        int decinum = 0;
        while(n>0){
            int lastDigit = n % 10;
            decinum = decinum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            n = n /10;

        }
        

        
        System.out.println("Decimal of" + n + decinum);
        
    }
    public static void main(String args[]){
        bintodeci(101);
    }

}
    
