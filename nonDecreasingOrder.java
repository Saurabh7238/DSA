import java.util.Scanner;

public class nonDecreasingOrder {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void reverse(int arr[]) {
        int i = 0, j = arr.length - 2;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--; // missing decrement for j
        }
    }

    static int[] sortSquares(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int ans[] = new int[n];
        int k = n-1; // fill from end to maintain non-decreasing order

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) { // fixed syntax: removed [right]
                ans[k] = arr[left] * arr[left];
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                right--;
            }
            k--;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the " + n + " no. of element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original arrY:- ");
        printArray(arr);
        int[] sorted = sortSquares(arr); // already sorted in non-decreasing order
        System.out.println("Sorted Array:- ");
        printArray(sorted);
    }
}