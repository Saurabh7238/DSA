class Solution {
    int[] ans = new int[1000];
    int count = 0;

    public int[] intersection(int[] nums1, int[] nums2) {
        compare(nums1, nums2, 0, 0);

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = ans[i];
        }

        return result;
    }

    void compare(int[] nums1, int[] nums2, int idx1, int idx2) {
        if (idx1 == nums1.length) {
            return;
        }

        if (idx2 == nums2.length) {
            compare(nums1, nums2, idx1 + 1, 0);
            return;
        }

        if (nums1[idx1] == nums2[idx2]) {
            boolean found = false;

            for (int i = 0; i < count; i++) {
                if (ans[i] == nums1[idx1]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans[count] = nums1[idx1];
                count++;
            }
        }

        compare(nums1, nums2, idx1, idx2 + 1);
    }
}