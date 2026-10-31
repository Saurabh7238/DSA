class Solution {
    public int pivotIndex(int[] arr) {

        int p = 0;

        while (p < arr.length) {

            int l = 0;
            int r = 0;

            for (int i = 0; i < p; i++) {
                l = l + arr[i];
            }

            for (int j = p + 1; j < arr.length; j++) {
                r = r + arr[j];
            }

            if (l == r) {
                return p;
            } else {
                p++;
            }
        }

        return -1;
    }
}