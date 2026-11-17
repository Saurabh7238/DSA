class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        int no = 0;
        int p = 0;

        for (int i = left; i <= right; i++) {
            p = i;
            boolean valid = true;

            while (p > 0) {
                no = p % 10;

                if (no == 0 || i % no != 0) {
                    valid = false;
                    break;
                }

                p = p / 10;
            }

            if (valid) {
                ans.add(i);
            }
        }

        return ans;
    }
}