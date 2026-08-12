import java.util.Scanner;

public class suffixAndprefix {

    // Corrected printArray method
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Prefix sum method
    static int[] makePrefixSumArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array:- ");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        System.out.println("enter the " + n + " element");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        printArray(arr1);

        int[] prefixSum = makePrefixSumArray(arr1);

        printArray(prefixSum);

        System.out.println("enter the no. of Queries");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter Range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefixSum[r - 1] - (l > 1 ? prefixSum[l - 2] : 0);
            System.out.println(ans);
        }
    }
}