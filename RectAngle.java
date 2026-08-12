import java.util.Scanner;

public class RectAngle {

    static void printSubMatrixSum(int[][] arr, int rowStart, int rowEnd, int colStart, int colEnd) {
        int sum = 0;
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of selected submatrix = " + sum);
    }

    // Optional: Placeholder for future optimization
    static int findsum(int[][] arr, int rowStart, int rowEnd, int colStart, int colEnd) {
        int sum = 0;
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter " + (r * c) + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter starting and ending row index (0-based):");
        int rowStart = sc.nextInt();
        int rowEnd = sc.nextInt();

        System.out.println("Enter starting and ending column index (0-based):");
        int colStart = sc.nextInt();
        int colEnd = sc.nextInt();

        printSubMatrixSum(arr, rowStart, rowEnd, colStart, colEnd);
        findsum(arr, rowStart, rowEnd, colStart, colEnd); // Currently 
      
    }
}