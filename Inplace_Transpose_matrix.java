import java.util.Scanner;

public class Inplace_Transpose_matrix {
    static void printArray(int arr[][]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static void transpose(int arr[][],int r1 ,int c1){
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }

        }
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of row");
        int r1= sc.nextInt();
        System.out.println("enter the size of column");
        int c1= sc.nextInt();
        int arr[][]=new int [r1][c1];
        System.out.println("enter the "+r1*c1+"element of matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j <c1 ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("orginal array");
        printArray(arr);

        transpose(arr,r1,c1);
        System.out.println("Transpose array");
        printArray(arr);
    }
}
