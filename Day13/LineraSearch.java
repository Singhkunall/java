public class LineraSearch {
    public static int linearS(int num[], int key){
        for(int i = 1; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = linearS(nums, key);

        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Index found at : " + index);
        }
    }
}
