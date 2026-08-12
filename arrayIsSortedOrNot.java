import java.util.Scanner;

public class arrayIsSortedOrNot {
    static boolean isSorted(int arr[]){
        boolean check=true;
        int n= arr.length;
        for (int i = 1; i <n ; i++) {
            if (arr[i] < arr[i - 1]){
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the "+n+ " element");
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();

        }
        System.out.println("is sorted:- "+isSorted(arr));
    }
}
