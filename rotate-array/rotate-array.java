class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = nums.clone();
        k = k % nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[(nums.length - k + i) % nums.length];
        }

    }
}