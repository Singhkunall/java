/* 
public class basicFunction {
    public static void printHelloWorld(){
        System.out.println("Hello world");
    }
    public static void main(String args[]){
        printHelloWorld();
    }

    
}

import java.util.*;
public class basicFunction{
    public static int calSum(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calSum(a, b);
        System.out.println("Sum is " + sum);

    }

    }
}

import java.util.*;
public class basicFunction{
    public static int swapnum(int a, int b){
        int temp = a; 
        a = b; 
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        swapnum(a, b);
        
    }

}

import java.util.*;

public class basicFunction {
    public static void swapnum(int a, int b) { 
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapnum(a, b);
    }
}

import java.util.*;
public class basicFunction{
    public static int productt(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num a and num b ");
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        productt(a, b);
        System.out.println(productt(a, b));
    }
}

import java.util.*;
public class basicFunction{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
             f = f*i;
             
        }
        return f;
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorialll = factorial(n);
        System.out.println(factorialll);
    }


}
*/
import java.util.*;
public class basicFunction {
    public static int factorial(int n){
        int factorial = 1;
        for(int i = 1; i<=n; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static int bincoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binCoeff = n_fact / (r_fact * nmr_fact);
        return binCoeff;
    }
    public static void main(String args[]){
        System.out.println(bincoeff(5, 2));
    }
}