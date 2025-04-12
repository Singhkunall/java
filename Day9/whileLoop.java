/* 
import java.util.*;

public class whileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int counter = 0;
            while(counter<100){
                System.out.println("Hello world");
                counter++;
            }

    }
    
}

// print number from 1 to 10.
import java.util.*;

public class whileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(n<=10){
            System.out.print(n + " ");
            n++;
        }

    }
}

//
import java.util.*;
public class whileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int n = sc.nextInt();
        while(counter<=n){
            System.out.print(counter + " ");
            counter++;
        }

    }
}
*/
//sum of first n number
import java.util.*;
public class whileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = sc.nextInt();
        while(i<=n){
            sum+=i;
            i++;

        }
        System.out.println(sum);
        

    }
}