import java.util.Scanner;

public class rotate_90_degree {
    static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // FIXED: j starts at i to prevent double-swapping back
    static void transpose(int arr[][], int r1, int c1){
        for (int i = 0; i < r1; i++) {
            for (int j = i; j < c1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // FIXED: Performs actual in-place row reversal using a two-pointer approach
    static void rotate(int arr[][], int r1, int c1){
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int r1 = sc.nextInt();
        System.out.println("Enter the no of columns:");
        int c1 = sc.nextInt();

        if(r1 != c1){
            System.out.println("The no of rows and columns should be exactly the same");
            return;
        }

        int arr[][] = new int[r1][c1];
        System.out.println("Enter " + r1*c1 + " elements:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt(); // FIXED: Used loop variables i and j
            }
        }

        System.out.println("\nOriginal array:");
        printArray(arr);

        transpose(arr, r1, c1);
        System.out.println("\nTranspose matrix:");
        printArray(arr);

        rotate(arr, r1, c1);
        System.out.println("\nRotate matrix (90 deg clockwise):");
        printArray(arr);

        sc.close();
    }
}