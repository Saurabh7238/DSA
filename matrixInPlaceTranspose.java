import java.util.Scanner;

public class matrixInPlaceTranspose {
    static void printArray(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static void transpose(int matrix[][],int r1,int c1)
    {
        for (int i = 0; i < r1; i++) {
            for (int j = i; j < c1; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of row ");
        int r1= sc.nextInt();
        System.out.println("enter the no.of column");
        int c1=sc.nextInt();
        int arr[] []=new int[r1][c1];
        System.out.println("enter the "+r1*c1+" element");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j <c1 ; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("original array");
        printArray(arr);
        System.out.println("transpose array");
        transpose(arr,r1,c1);
        printArray(arr);
    }
    }

