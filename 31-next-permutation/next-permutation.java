
class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int temp;

        if (isSorted(nums)) {
            if (n >= 2) {
                temp = nums[n - 1];
                nums[n - 1] = nums[n - 2];
                nums[n - 2] = temp;
            }
        } 
        else {
            int i = n - 2;

            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }

            if (i >= 0) {
                int j = n - 1;

                while (nums[j] <= nums[i]) {
                    j--;
                }

                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
