/* 
// print Star Pattern
import java.util.*;
public class patterns {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to print as a star ");

        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" * "  );
                

            }
            System.out.println();
            
        }
       
    }
}

// Print inverted Star pattern
import java.util.*;

public class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}

//Print half pyramid pattern

import java.util.*;

public class pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //int num = 1;
        for (int i = 1; i<=4; i++){
            
            for(int num = 1; num<=i; num++){
                //num++;
                System.out.print(num);

            }
            System.out.println();
        }
    }
}

//Print character patten;
import java.util.*;

public class pattern{
    public static void main(String args[]){
        char ch = 'A';
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
*/
public class pattern{
    public static void main(String args[]){
        

        for(int i = 1; i<=4; i++){
            System.out.println(" ");
            for(int j = 1;  j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
