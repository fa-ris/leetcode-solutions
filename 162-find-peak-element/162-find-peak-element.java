class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            int hih = mid + 1;
            if (nums[mid] < nums[hih]) {
                i = hih;
            } else {
                j = mid;
            }
        }
        return i;
    }
}