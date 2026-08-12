package Recursion.ArrayList;

import java.util.ArrayList;

public class finAllindices {
    static ArrayList<Integer> FAI(int []arr, int target, int idx){
        if(idx>=arr.length) return new ArrayList<>();

        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns=FAI(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String []args){
        int[] arr={5,6,7,8,9,10,5,1,5};
        ArrayList<Integer> ans=FAI(arr,5,0);
        for(Integer i:ans){
            System.out.println(i);
        }
    }
}
