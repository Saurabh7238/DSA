import java.util.Scanner;

public class greaterOrNot {
    static int Greater(int arr[],int x){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                ans++;
            }
        }
        return ans;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of array");
            int n= sc.nextInt();
            int [] arr=new int[n];
            System.out.println("enter the "+n+" element");
            for (int i = 0; i <n; i++) {
                arr[i]= sc.nextInt();

            }
            System.out.println("enter the value of x ");
            int x= sc.nextInt();
            System.out.println("Greater or Not "+ Greater(arr, x));
        }
}

