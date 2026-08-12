package Recursion.Array;

public class lastIndex{
    static int aSON(int []arr,int idx, int target){
        if(idx==arr.length) return -1;

        int ans=aSON(arr, idx+1, target);
        if(ans!=-1) return ans;

        if(arr[idx]==target)return idx;
        return -1;

    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,6,4};
        System.out.println(aSON(arr,0,4));
    }
}
