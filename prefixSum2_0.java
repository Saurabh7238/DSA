import java.util.Scanner;

public class prefixSum2_0 {
    // Method to calculate sum of submatrix
    static int findSum(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = 0;
        // Loop through rows from r1 to r2
        for (int i = r1; i <= r2; i++) {
            // Loop through columns from c1 to c2
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j]; // add each element
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        // Input matrix elements
        int num=0;
//        System.out.println("Enter " + (r * c) + " elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = num;
                num++;
            }
        }
        System.out.println("Total Element = "+num);

        // Input submatrix coordinates
        System.out.println("Enter top-left (r1, c1) and bottom-right (r2, c2) coordinates:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Print result
        int result = findSum(arr, r1, c1, r2, c2);
        System.out.println("Rectangle sum = " + result);
    }
}
