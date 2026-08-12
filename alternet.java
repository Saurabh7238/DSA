import java.util.Scanner;

public class alternet {
    static void printAlterNet(int arr[]){
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element");
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        printAlterNet(arr);
    }
}
