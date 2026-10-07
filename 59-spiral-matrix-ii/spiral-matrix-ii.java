class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        int toprow = 0;
        int bottomrow = n - 1;
        int leftcol = 0;
        int rightcol = n - 1;

        int value = 1;

        while (value <= n * n) {

            for (int j = leftcol; j <= rightcol; j++) {
                arr[toprow][j] = value;
                value++;
            }
            toprow++;

            for (int i = toprow; i <= bottomrow; i++) {
                arr[i][rightcol] = value;
                value++;
            }
            rightcol--;

            for (int j = rightcol; j >= leftcol; j--) {
                arr[bottomrow][j] = value;
                value++;
            }
            bottomrow--;

            for (int i = bottomrow; i >= toprow; i--) {
                arr[i][leftcol] = value;
                value++;
            }
            leftcol++;
        }

        return arr;
    }
}