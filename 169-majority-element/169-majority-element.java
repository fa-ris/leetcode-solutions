class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == first) {
                count++;
            } else if (nums[i] != first && count > 0) {
                count--;
            } else {
                count++;
                first = nums[i];
            }
        }
        return first;
    }
}