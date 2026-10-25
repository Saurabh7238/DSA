
class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (arr[maxIndex] > arr[i]) {
                char temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;

                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }
}
