import java.util.Scanner;

public class FrequencyArray {
    static int[] MakeFrequencyArray(int[] arr) {
        int freq[] = new int[10005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;  // Corrected frequency count
        }
        return freq;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = MakeFrequencyArray(arr);

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter number to be searched:");
            int x = sc.nextInt();

            if (freq[x] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            q--;  // Decrement inside the loop
        }

        sc.close();  // Good practice to close the scanner
    }
}