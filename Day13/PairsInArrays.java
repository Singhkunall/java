public class PairsInArrays {
    public static void printPairs(int n[]){
        int tp = 0;
        for(int i = 0; i<n.length; i++){
            int current = n[i];
            for(int j = i+1; j<n.length; j++){
                System.out.print("(" + current + "," + n[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }
    public static void main(String args[]){
        int n[] = {2,4,6,8,10};
        printPairs(n);
    }
}
