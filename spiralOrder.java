import java.util.Scanner;

public class spiralOrder {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralMatrix(int arr[][], int r1, int c1) {
        int topRow = 0, bottomRow = r1 - 1;
        int leftCol = 0, rightCol = c1 - 1;
        int totalElements = 0;

        System.out.println("Spiral Order:");
        while (totalElements < r1 * c1) {
            // Top Row
            for (int j = leftCol; j <= rightCol && totalElements < r1 * c1; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // Right Column
            for (int i = topRow; i <= bottomRow && totalElements < r1 * c1; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // Bottom Row
            for (int j = rightCol; j >= leftCol && totalElements < r1 * c1; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // Left Column
            for (int i = bottomRow; i >= topRow && totalElements < r1 * c1; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows (r1):");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns (c1):");
        int c1 = sc.nextInt();

        int arr[][] = new int[r1][c1];
        System.out.println("Enter " + (r1 * c1) + " elements:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        printMatrix(arr);
        spiralMatrix(arr, r1, c1);
    }
}