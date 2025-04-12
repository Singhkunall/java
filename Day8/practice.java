/* 
//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;
public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number<0){
            System.out.println("Enetered number is Negative");
        }
        else if(number>0){
            System.out.println("Enetered number is positive");
        }
        else{
            System.out.println("Enetered correct format");
            
        }
    }

    
}
 */
// Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;

public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        
        int year = sc.nextInt();

        if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
            System.out.println("Entered year is a leap year.");
        } 
        else {
            System.out.println("Entered year is not a leap year.");
        }
        sc.close();
    }
}
