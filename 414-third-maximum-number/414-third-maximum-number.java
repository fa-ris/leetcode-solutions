class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int second = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < nums[nums.length - 1] && second == Integer.MAX_VALUE) {
                second = nums[i];
            } else if (nums[i] < second && second != Integer.MAX_VALUE) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}