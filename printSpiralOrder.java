import java.util.Scanner;

public class printSpiralOrder {
    static void printMatrix(int [][]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    static void spiralMatrix(int arr[][],int r1,int c1){
        int topRow=0, bottomRow=r1-1, lrftCol=0, rightCol=c1-1; // 'lrftCol' kept as-is
        int totalElements=0;
        while (totalElements < r1 * c1){
            for (int j = lrftCol; j <= rightCol && totalElements < r1 * c1 ; j++) {
                System.out.print(arr[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow && totalElements < r1 * c1 ; i++) {
                System.out.print(arr[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            for (int j = rightCol; j >= lrftCol && totalElements < r1 * c1 ; j--) {
                System.out.print(arr[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow && totalElements < r1 * c1 ; i--) {
                System.out.print(arr[i][lrftCol]+" ");
                totalElements++;
            }
            lrftCol++;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row");
        int r1=sc.nextInt();
        System.out.println("enter the size of column");
        int c1= sc.nextInt();
        int arr[][]=new int[r1][c1];
        System.out.println("enter"+r1*c1+" element");
        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j <c1 ; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("before");
        printMatrix(arr);
        System.out.println("after");
        spiralMatrix(arr,r1,c1);
    }
}