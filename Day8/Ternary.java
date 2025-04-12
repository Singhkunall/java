/* 
public class Ternary {
    public static void main(String args[]){
        int number = 6;
        String type = ((number % 2 == 0)) ? "Even" : "Odd";
        System.out.println(type); 
    }
    
}

*/
import java.util.*;

public class Ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String Report = ((marks>=33)) ? "Pass" : "Fail";
        System.out.println(Report);
        
    }
}