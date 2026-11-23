class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        long number = 1;

        for (int j = 0; j <= rowIndex; j++) {
            ans.add((int) number);
            number = number * (rowIndex - j) / (j + 1);
        }

        return ans;
    }
}