class Solution {
    public int maxSubArray(int[] nums) {
        int[] table = new int[nums.length];
        table[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (table[i - 1] + nums[i] < nums[i]) {
                table[i] = nums[i];
            } else {
                table[i] = table[i - 1] + nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < table.length; i++) {
            if (table[i] > max) {
                max = table[i];
            }
        }
        return max;
    }
}