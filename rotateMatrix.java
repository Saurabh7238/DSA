import java.util.Scanner;

public class rotateMatrix {
    static void printMatrix(int [][]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void matrixInPlaceTranspose(int arr[][],int r1,int c1){
        for (int i = 0; i <r1 ; i++) {
            for (int j = i; j <c1 ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    static void rotate(int[][]matrix,int n){

            matrixInPlaceTranspose(matrix, n, n);
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r1");
        int r1=sc.nextInt();
        System.out.println("enter c1");
        int c1= sc.nextInt();
        int arr[][]=new int[r1][c1];
        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j <c1 ; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(arr);
        rotate(arr,r1);
        System.out.println("rotated matrix");
        printMatrix(arr);
    }
}
