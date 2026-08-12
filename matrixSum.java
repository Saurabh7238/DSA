import java.util.Scanner;

public class matrixSum {
    static void printMatrix(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralMatrix(int [][]arr, int r1, int c1){
        int topRow = 0, bottomRow = r1 - 1;
        int leftCol = 0, rightCol = c1 - 1;
        int totalElement = 0;
        int sum = 0;

        while (totalElement < r1 * c1) {
            // Top row
            for (int j = leftCol; j <= rightCol && totalElement < r1 * c1; j++) {
                sum += arr[topRow][j];
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

            // Right column
            for (int i = topRow; i <= bottomRow && totalElement < r1 * c1; i++) {
                sum += arr[i][rightCol];
                System.out.print(arr[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            // Bottom row
            for (int j = rightCol; j >= leftCol && totalElement < r1 * c1; j--) {
                sum += arr[bottomRow][j];
                System.out.print(arr[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

            // Left column
            for (int i = bottomRow; i >= topRow && totalElement < r1 * c1; i--) {
                sum += arr[i][leftCol];
                System.out.print(arr[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }

        System.out.println("\nTotal Sum = " + sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int arr[][] = new int[r1][c1];
        int num = 1;

        // Fill matrix automatically with 1..r1*c1
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = num++;
            }
        }

        System.out.println("Before matrix:");
        printMatrix(arr);

        System.out.println("Spiral traversal:");
        spiralMatrix(arr, r1, c1);
    }
}
