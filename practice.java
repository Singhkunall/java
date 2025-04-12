/* 
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.*;
public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer");

        int n = sc.nextInt();

        int evensum = 0;
        int oddsum = 0;

        while(n>0){
            int lastDigit = n % 10;
            if(lastDigit % 2 == 0){
                evensum+=lastDigit;

            }
            else{
                oddsum+=lastDigit;
            }
            n = n/10;
        }
        System.out.println("EvenNumber: " + evensum);
        System.out.println("EvenNumber: " + oddsum);
    
    }
} 


//Write a program to find the factorial of any number entered by the user

import java.util.*;

public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i<=n; i++){
            
            factorial*=i;
        }
        System.out.println("Factorial of "+ n + " is " + factorial);

    }
}


//Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;
public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number");

        int n = sc.nextInt();
        int multiplication = 1;

        for(int i =  1; i<=10; i++){
            multiplication = n*i;

            System.out.println(n + " * " + i + " = " + multiplication);



        }
        
    }
}
*/ 
public enum practice(
    
)
