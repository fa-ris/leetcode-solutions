class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1, max = -1;
        while (l < r) {
            if (nums[r] + nums[l] < k) {
                max = Math.max(nums[l] + nums[r], max);
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}