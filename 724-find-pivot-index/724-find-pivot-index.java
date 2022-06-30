class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                arr1[i] = nums[i];
                arr2[nums.length - 1] = nums[nums.length - 1 - i];
            } else {
                arr1[i] = arr1[i - 1] + nums[i];
                arr2[nums.length - 1 - i] = arr2[nums.length - i] + nums[nums.length - 1 - i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (arr1[i] == arr2[i]) {
                return i;
            }
        }
        return -1;
    }
}