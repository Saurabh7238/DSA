import java.util.Scanner;
public class PairSum {
    static int pairSum(int []arr,int target){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] + arr[j] == target) {
                    sum++;
                }

            }
        }
        return sum;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element:- ");
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target");
        int target=sc.nextInt();
        System.out.println("sum of target"+pairSum(arr,target));




    }
}
