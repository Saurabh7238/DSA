class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        int no, p;

        for (int i = left; i <= right; i++) {
            p = i;

            while (p > 0) {
                no = p % 10;

                if (no == 0 || i % no != 0) {
                    break;
                }

                p = p / 10;
            }

            if (p == 0) {
                ans.add(i);
            }
        }

        return ans;
    }
}