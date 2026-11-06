import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int papers = n - i;

            if (citations[i] >= papers) {
                ans = Math.max(ans, papers);
            }
        }

        return ans;
    }
}