class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr1 = new int[nums.length / 2]; // evens
        int[] arr2 = new int[nums.length / 2]; // odds
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr1[j] = nums[i];
                j++;
            } else {
                arr2[k] = nums[i];
                k++;
            }
        }
        j = 0;
        k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = arr1[j];
                j++;
            } else {
                nums[i] = arr2[k];
                k++;
            }
        }
        return nums;
    }
}