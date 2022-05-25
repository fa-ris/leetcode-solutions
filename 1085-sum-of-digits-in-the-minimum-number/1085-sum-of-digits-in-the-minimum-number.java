class Solution {
    public int sumOfDigits(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] < 10) {
            return nums[0] % 2 == 1 ? 0 : 1;
        } else if (nums[0] < 100) {
            return ((int) (nums[0] / 10) + nums[0] % 10) % 2 == 1 ? 0 : 1;
        }
        return 0;
    }
}