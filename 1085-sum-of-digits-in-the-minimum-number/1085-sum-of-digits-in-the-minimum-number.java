class Solution {
    public int sumOfDigits(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        //Arrays.sort(nums);
        if (min < 10) {
            return min % 2 == 1 ? 0 : 1;
        } else if (min < 100) {
            return ((int) (min / 10) + min % 10) % 2 == 1 ? 0 : 1;
        }
        return 0;
    }
}