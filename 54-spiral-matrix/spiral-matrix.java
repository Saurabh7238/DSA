class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int toprow = 0;
        int bottomrow = rows - 1;
        int leftcol = 0;
        int rightcol = cols - 1;

        int totalElement = 0;

        while (totalElement < rows * cols) {

            for (int j = leftcol; j <= rightcol && totalElement < rows * cols; j++) {
                result.add(matrix[toprow][j]);
                totalElement++;
            }
            toprow++;

            for (int i = toprow; i <= bottomrow && totalElement < rows * cols; i++) {
                result.add(matrix[i][rightcol]);
                totalElement++;
            }
            rightcol--;

            for (int j = rightcol; j >= leftcol && totalElement < rows * cols; j--) {
                result.add(matrix[bottomrow][j]);
                totalElement++;
            }
            bottomrow--;

            for (int i = bottomrow; i >= toprow && totalElement < rows * cols; i--) {
                result.add(matrix[i][leftcol]);
                totalElement++;
            }
            leftcol++;
        }

        return result;
    }
}