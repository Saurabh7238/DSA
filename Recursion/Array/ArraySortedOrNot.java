package Recursion.Array;

public class ArraySortedOrNot {
    static boolean aSON(int []arr,int idx){
        if(idx==arr.length) return true;

        if (arr[idx]<arr[idx-1]) return false;

        return aSON(arr,idx+1);

    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,6};
        System.out.println(aSON(arr,1));
    }
}
