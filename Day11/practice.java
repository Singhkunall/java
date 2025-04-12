//Write a Java method to compute the average of three numbers..
/*import java.util.*;
public class practice {
    public static void Average(int a, int b, int c){
        Scanner sc = new Scanner(System.in);
        int average = (a + b + c)/3;

        System.out.println("Average of " + a  +  b  +  c  +  " = " +average);

    }
    public static void main(String args[]){
        Average(5, 5, 5);
        
    }

    
}

//Write a method named isEven that accepts an int argument. The method
//should return true if the argument is even, or false otherwise. Also write a program to test your
//method.
import java.util.*;
public class practice{
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        
        int k = sc.nextInt();
        System.out.println(isEven(k));
    }
}

//Write a Java program to check if a number is a palindrome in Java? ( 121 is a
//palindrome, 321 is not)
//A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
//palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
//palindrome because the reverse of 321 is 123, which is not equal to 321

public class practice {
    public static void palindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = rev * 10+ lastDigit;
            n = n/10;

        }
        if(rev == original){
            System.out.println("Palindrome");

        }
        else{
            System.out.println(" notPalindrome");

        }
    }
    public static void main(String args[]){
        palindrome(121);
    }

}
*/
//Write a Java method to compute the sum of the digits in an integer.
public class practice{
    public static void main(String args[]){
        int n = 123;
        int rev =0;
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n = n/10; 
        }
        System.out.println(sum);
    }
}