/* 
import java.util.*;

public class Else_if {
    public static void main(String args[]){
        int age = 13;

        if(age>=18){
            System.out.println("Adult");

        }
        else if (age<14 && age>33){
            System.out.println("Middel age");

        }
        else{
            System.out.println("teenager");
        }
       
    }
    
}

import java.util.*;

public class Else_if {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income<300000){
            tax = 0;
        }
        else if(income <= 500000 && income >= 100000){
            tax = (int) (income * 0.2);


        }
        else{
            tax = (int) (income * 0.3); 
        }
        System.out.println(tax);

    }
}
*/
import java.util.*;

public class Else_if {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a>b)&&(a>c)){
            System.out.println("a" + a);
        }
        else if((b>a)&&(b>c)){
            System.out.println("b" + b);
        }
        else{
            System.out.println("c" + c);

        }
    }
}
