/* 
public class forLoop {
    public static void main(String args[]){
        for(int i = 1; i<=10; i++){
            System.out.println("Hello World");
        }
    }
    
}

import java.util.*;
public class forLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
        
            System.out.println("* * * * *");
        }
    }
}

// Reversing a number
import java.util.*;
public class forLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;

        }
        //System.out.println();
    }
}
*/
import java.util.*;
public class forLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        for(int i = 1; i<=n; i++){
            int lastDigit = n%10;
             rev = (rev*10)+lastDigit;
            n = n/10;

            //System.out.print(rev);
        }
        System.out.print(rev);
    }
}

