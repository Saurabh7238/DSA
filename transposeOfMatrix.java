import java.util.Scanner;

public class transposeOfMatrix {
    static void printArray(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static int[][] transposeMatrix(int arr[][], int r,int c){
        int ans[][]=new int[c][r];
        for (int i = 0; i <c ; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the R");
        int r= sc.nextInt();
        System.out.println("enter the column");
        int c= sc.nextInt();
        int matrix[][]=new int[r][c];
        int totalNumber=r*c;
        System.out.println("enter "+totalNumber+"element");
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c ; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printArray(matrix);
        System.out.println("transpose Matrix");
        int ans[][]=transposeMatrix(matrix,r,c);
        printArray(ans);
    }
}
