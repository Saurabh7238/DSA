package Recursion.Array;

public class GreatestNoInArray {
    static int greatest(int[] arr,int idx){
        if(idx== arr.length-1) return arr[idx];

        int smallAns=greatest(arr,idx+1);
        return Math.max(smallAns,arr[idx]);
    }

    public static void main(String[] args) {
        int []arr={5,8,3,6,4,9,1};
        System.out.println(greatest(arr ,0));
    }
}
