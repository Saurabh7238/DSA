package Striver;
import java.util.Arrays;
class solution {
    public static int largestElementt(int[] nums) {
     Arrays.sort(nums);
     return nums[nums.length-1];
    }
}
public class LargestElement{
    public static  void main(String args[]){
        int[] arr={2,5,1,3,0};
        int []arr2={8,10,7,9};
        System.out.println("the largest element in array "+ solution.largestElementt(arr));
        System.out.println("the largest element in array "+ solution.largestElementt(arr2));
    }
}
