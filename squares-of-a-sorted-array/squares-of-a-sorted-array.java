class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            nums[j] = nums[j] * nums[j];
        }
        ssHelper(nums);
        return nums;
    }
    
    private void ssHelper(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int mid = nums.length / 2;
        int index = 0;
        int[] left = new int[mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = nums[index];
            index++;
        }
        int[] right = new int[nums.length - mid];
        for (int i = 0; i < right.length; i++) {
            right[i] = nums[index];
            index++;
        }
        ssHelper(left);
        ssHelper(right);
        int l = 0;
        int r = 0;
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                nums[l + r] = left[l];
                l++;
            } else {
                nums[l + r] = right[r];
                r++;
            }
        }
        while (l < left.length) {
            nums[l + r] = left[l];
            l++;
        }
        while (r < right.length) {
            nums[l + r] = right[r];
            r++;
        } 
    }
}