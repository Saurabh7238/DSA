package Recursion.Array;

public class findAllIndices {
    static void FAI(int [] arr, int idx,int target){
        if(idx>=arr.length) return;

        if(arr[idx]==target){
            System.out.println(idx);
        }
        FAI(arr, idx+1, target);
    }
    public static void main(String []args){
        int [] arr={5,6,7,7,8,8,9,};
        FAI(arr,0,7);
    }
}
