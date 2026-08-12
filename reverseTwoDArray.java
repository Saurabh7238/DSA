import java.util.Scanner;

public class reverseTwoDArray {
    static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static void reverse(int arr[][]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of row");
        int r= sc.nextInt();
        System.out.println("enter the no. of column");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter the element of array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Original array:- ");
        printArray(arr);
        System.out.println("reverse array:- ");
        reverse(arr);

    }

}
