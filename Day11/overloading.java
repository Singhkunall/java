/* 
public class overloading {
    // Function to cal 2 numbers
    //public static int sum(int a, int b){
        //return a + b;
    //}
    // Functions to calculate three numbers.
    //public static int sum(int a, int b, int c){
        //return a + b + c;

   // }
    public static int sum(int a, int b){
        return a +b;

    }
    public static float sum(float a, float b, float c ){
        return a + b+ c;
    }


    public static void main(String args[]){
        //int a = 5;
        //int b = 3;
        //int c = 4;
        System.out.println(sum(3, 5));
        System.out.println(sum(4.8f,3.4f,2.6f));

    }




    
}

// Check whether the number is prime or not
import java.util.*;
public class overloading{
    public static boolean cprime(int n){
        boolean isprime = true;
        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        return isprime;
    
    }
    public static void main(String args[]){
        System.out.print(cprime(11));
    }
}
*/
// Check whether the number is prime in range.

import java.util.*;

public class overloading {

    // Method to check if a number is prime
    public static boolean CheckPrime(int n) {
        if (n < 2) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print prime numbers in a given range
    public static void rangeInPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (CheckPrime(i)) {
                System.out.print(i + " "); // Print prime numbers
            }
        }
        System.out.println(); // Newline for better formatting
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to " + n + ":");
        rangeInPrime(n);
        sc.close();
    }
}