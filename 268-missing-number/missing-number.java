
class Solution {
    public int missingNumber(int[] nums) {
        return find(nums, 0);
    }

    public int find(int[] nums, int i) {
        if (i == nums.length) {
            return i;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == i) {
                return find(nums, i + 1);
            }
        }

        return i;
    }
}
