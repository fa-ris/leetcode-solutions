class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        if (target <= nums[0]) return 0;
        while (l <= r) {
            int mid = r-l / 2;
            if (target == nums[mid]) return mid;
            if (target < nums[l]) {
                return l;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
        }
}
