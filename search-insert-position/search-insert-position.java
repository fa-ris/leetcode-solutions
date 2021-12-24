class Solution {
    public int searchInsert(int[] nums, int target) {
        int[] arr = binarySearch(nums, target, 0, nums.length - 1);
        return arr.length == 2 ? arr[1] : arr[0];
    }
    
    public int[] binarySearch(int[] nums, int target, int l, int h) {
        int mid = l + ((h - l) / 2);
        if (l > h) {
            int[] temp = new int[2];
            temp[0] = -1;
            temp[1] = mid;
            return temp;
        }
        if (nums[mid] == target) {
            int[] temp = new int[1];
            temp[0] = mid;
            return temp;
        } else if (target < nums[mid]) {
            return binarySearch(nums, target, l, mid - 1);
        } else if (target > nums[mid]) {
            return binarySearch(nums, target, mid + 1, h);
        }
        return new int[2];
    }
}