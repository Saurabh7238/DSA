import java.util.Scanner;
public class addingMatrix {
    static void printMatrix(int [][]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static void add(int [][]a,int [][]b,int r1,int c1,int r2,int c2){
        if(r1!=c1 || r2!=c2){
            System.out.println("invalid input bcoz of dimensions are mismatched");
            return;
        }
       int [][]sum=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printMatrix(sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of row of array 1:- ");
        int r1= sc.nextInt();
        System.out.println("enter the no of column of array 1:- ");
        int c1= sc.nextInt();
        int [][]a=new int[r1][c1];
        System.out.println("enter the matrix 1 value:- ");
        for (int i = 0; i <r1 ; i++) {
            for (int j=0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }

        }
        System.out.println("enter the no of row of array 2:- ");
        int r2= sc.nextInt();
        System.out.println("enter the no of column of array 2:- ");
        int c2= sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("enter the element of matrix 2 value:- ");
        for(int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        printMatrix(a);
        System.out.println("matrix 2");
        printMatrix(b);
        System.out.println("sum of array:- ");
        add(a,b,r1,c1,r2,c2);
    }
}
