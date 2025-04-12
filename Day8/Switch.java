/* 
public class Switch {
    public static void main(String args[]){
        int number = 2;
        switch(number){
            case 1 : System.out.println("Kunal");
                        break;
            case 2 : System.out.println("Anshika");
                        break;
            case 3 : System.out.println("Roomate");

            default : System.out.println("Lnaa");
        }
    }

    
}

import java.util.*;

public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");

        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                            break;
                            
            case '-' : System.out.println(a-b);
                            break;
            case '*' : System.out.println(a*b);
                            break;
            case '/' : System.out.println(a/b);
                            break;
            case '%' : System.out.println(a%b);

            default : System.out.println("Error");

        }

    }
}
*/
import java.util.*;
public class Switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator: ");

        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);

            default : System.out.println("error");
        }

    }
}