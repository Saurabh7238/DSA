//
import java.util.Scanner;
public class findOccurrance{
    static int occurrance(int[]arr, int x) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                count++;
            }
        };
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the "+n+" element of array:- ");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the x");
        int x= sc.nextInt();
        System.out.println("Occurrance of x:- "+occurrance(arr,x));

    }
}