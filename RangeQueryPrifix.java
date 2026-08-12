import java.util.Scanner;

public class RangeQueryPrifix {
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] makePrefixSumArray(int[] arr) {
        int[] prefixSum = new int[arr.length + 1]; // 1-based indexing
        for (int i = 1; i <= arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr1);

        int[] prefixSum = makePrefixSumArray(arr1);

        System.out.println("Prefix Sum Array:");
        printArray(prefixSum);

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter Range (1-based index):");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefixSum[r] - prefixSum[l - 1];
            System.out.println("Sum from index " + l + " to " + r + " is: " + ans);
        }
    }
}