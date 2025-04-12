/* 
public class largestInArray {
    public static int largestn(int num[]){
        //int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<num.length; i++){
            if(smallest>num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int num[] = {1,2,6,3,5};

        System.out.println("smallest num = " + largestn(num));
    }
}
*/
public class largestInArray {
    public static int largestn(int num[]){
        int largest = Integer.MIN_VALUE;
        

        for(int i = 0; i<num.length; i++){
            if(largest<num[i]){
                laargest = num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num[] = {1,2,6,3,5};

        System.out.println("largest num = " + largestn(num));
    }
}