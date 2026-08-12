import java.util.Scanner;

public class TwoPointer {
    static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
//    static void swap(int arr[],int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
    static void sortZerosAndOne(int arr[]){
        int n=arr.length;
        int zeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for (int i=0;i<n;i++){
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("original array");
        printArray(arr);
        sortZerosAndOne(arr);
        System.out.println("sorted array");
        printArray(arr);
    }

}
