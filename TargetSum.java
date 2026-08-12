import java.util.Scanner;

public class TargetSum {
    static int targetSum(int arr[],int target){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }

        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element of array");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the target");
        int target= sc.nextInt();
        System.out.println("Number of triplets with sum " + target + " is " + targetSum(arr, target));
    }
}
