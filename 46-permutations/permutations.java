class Solution {

    public List<List<Integer>> permute(int[] nums) {

        int n = nums.length;

        int k = 1;
        for (int i = 1; i <= n; i++) {
            k = k * i;
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        boolean[] used = new boolean[n];

        generate(nums, ans, temp, used);

        return ans;
    }

    static void generate(int[] nums, List<List<Integer>> ans,
                         List<Integer> temp, boolean[] used) {

        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i] == false) {

                temp.add(nums[i]);
                used[i] = true;

                generate(nums, ans, temp, used);

                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
}
