/* 
public class BinarySearch {
    public static int Binearys(int num[], int key){
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(num[mid] == key){
                return mid;
            }if(num[mid]<key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 4;
        //int index = Binearys(num, key);
        //if(index == -1){
        //    System.out.println("Not found");

        //}else{
           // System.out.println("Match Found" + " " + index);

       // }
       System.out.println("index for key is :  " + Binearys(num, key));
    }

    
}
*/
public class BinarySearch{
    public static void main(String args[]){
        int arr [] = {2, 4, 6, 8, 10};
        
        for(int i = 0; i <= arr.length; i++){
            int num = arr[i];
            int rev = 0;

            while(num > 0){
                int lastDigit = num % 10;
                rev = rev * 10 + lastDigit;
                num = num/10;
            }
            arr[i] = rev;
            System.out.print(rev);

            

        }
        

    }
}

