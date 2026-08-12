package Recursion.Array;

public class sumOfArray {
    static int soa(int []arr,int idx){
        if(idx==arr.length) return 0;

        int smallAns=soa(arr,idx+1);
        return smallAns+arr[idx];
    }
    public static void main(String[] args){
        int []arr={5,7,9,1,2,3,4,8};
        System.out.println(soa(arr,0));
    }
}
