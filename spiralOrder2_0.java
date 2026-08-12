import java.util.Scanner;

public class spiralOrder2_0 {
    static void printMatrix(int [][]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiralMatrix(int [][]arr,int r1,int c1){
        int topRow=0,bottomRow=r1-1,leftCol=0,rightCol=c1-1;
        int totalElement=0;
        if (r1!=c1){
            System.out.println("row and column should be exactly same");
            return;
        }
        while (totalElement<r1*c1) {
            for (int j = leftCol; j <= rightCol && totalElement < r1 * c1; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow && totalElement<r1*c1; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && totalElement<r1*c1; j--) {
                System.out.print(arr[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;
            for (int i = bottomRow; i >=topRow && totalElement<r1*c1 ; i--) {
                System.out.print(arr[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;

        }
    }

    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in );
        System.out.println("enter the r1 & c1");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int TotalElement=r1*c1;
        System.out.println( TotalElement +" element printing..");
        int num=1;
        int arr[][]=new int[r1][c1];
        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j]= num;
                num++;
            }
        }
        System.out.println("before matrix");
        printMatrix(arr);
        System.out.println("after matrix");
        spiralMatrix(arr,r1,c1);

    }
}
