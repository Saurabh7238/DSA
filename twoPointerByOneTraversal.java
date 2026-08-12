import java.util.Scanner;

public class twoPointerByOneTraversal {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void swapZerosAndOnes(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
//        printArray(arr);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the "+n+"element");
        for (int i = 0; i <n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Original array ");
        printArray(arr);

        swapZerosAndOnes(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
