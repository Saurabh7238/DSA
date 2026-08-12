import java.util.Scanner;

public class RotateArray {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        // Copy last k elements to the beginning
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // Copy first n-k elements to the end
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        System.out.println("Original array:");
        printArray(arr);

        int[] ans = rotate(arr, k);

        System.out.println("Array after rotation:");
        printArray(ans);
    }
}