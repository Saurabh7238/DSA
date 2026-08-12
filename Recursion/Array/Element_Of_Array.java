package Recursion.Array;

public class Element_Of_Array {
    static int EOA(int arr[],int idx){
        if (idx== arr.length) {
        return 0;}

        System.out.println(arr[idx]);
         return EOA(arr,idx+1)+arr[idx];
    }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        EOA(arr,0);
    }
}
