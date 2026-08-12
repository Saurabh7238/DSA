package Recursion.Array;

public class tergetElement {
    static boolean target(int []arr ,int idx ,int target ){
        if(idx>=arr.length) return false;

        if(arr[idx]==target) return true;

        return target(arr,idx+1,target);
    }

    public static void main(String[] args) {
        int []arr={5,6,7,8,9,10};
        System.out.println(target(arr,0,8));
    }
}
