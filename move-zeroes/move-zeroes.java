class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            } else {
                count++;
            }
        }
        if (count != 0) {
            for (int i = 1; i < count + 1; i++) {
                nums[nums.length - i] = 0;
            }
        }
    }
}