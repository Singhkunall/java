/* 
import java.util.*;

public class if_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Valid for voting as well as Driving");
        }
        if(age > 13 && age<45){
            System.out.println("Adult");

        }
        else{
            System.out.println("Not Valid for Driving as well as Voting");
        }
    }
     
}
import java.util.*;
public class if_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        


        if(A>=B){
            System.out.println("A:" + (A) + " A is greater than B ");

        }
        else{
            System.out.println("B:" + (B)+ " B is greater than A ");
        }
    }
}
*/
import java.util.*;

public class if_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Even number");

        }
        else{
            System.out.println("Odd Number");
        }
    }
}