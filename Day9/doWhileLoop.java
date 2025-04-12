/*
public class doWhileLoop {
    public static void main(String args[]){
        int i = 1;
        do{
            System.out.println("Anshika");
            i++;

        } while(i<=10);
    }
    
}

public class doWhileLoop {
    public static void main(String args[]){
        for(int i = 0; i<=5;i++){
            if(i==3){
                break;

            }
            System.out.println(i);
        }
        System.out.println("Sunny is gay");
    }
}


import java.util.*;
public class doWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
         

        do{
            System.out.println("Enter a numner ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);

    }
}

public class doWhileLoop {
    public static void main(String args[]){
        for (int i = 1; i<=4; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
    }
}


import java.util.*;

public class doWhileLoop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number");
        //int n = sc.nextInt();
        do{
            System.out.println("Enter number");
            int n = sc.nextInt();
            if(n%10 == 0){
                continue;

            }
            System.out.println("number was :" + n);

        }while(true);
    }
}
*/

// Checking for prime

import java.util.*;

public class doWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true;
        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                isprime = false;
            }
        }
        if(isprime == true){
            System.out.println(n + "Entered number is prime.");
        }else{
            System.out.println(n + "Entered number is not prime.");
        }
    }
}