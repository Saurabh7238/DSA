import java.util.Scanner;
public class FindSecondMAx {
    static int FindMAx(int arr[]){
        int mx=Integer.MIN_VALUE;
        int n= arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }

        }
        return mx;
    }
    static int findSecondMax(int arr[]){
        int mx=FindMAx(arr);
        int n=arr.length;
        for (int i=0; i<n;i++){
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=FindMAx(arr);
        return secondMax;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the "+n+" element");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second largest number is: " + findSecondMax(arr));
    }
}
