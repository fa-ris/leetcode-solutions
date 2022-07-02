class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int pos = 0;
        int neg = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[pos] = nums[i];
                pos++;
            } else {
                arr[neg] = nums[i];
                neg++;
            }
        }
        pos = 0;
        neg = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = arr[pos];
                pos++;
            } else {
                nums[i] = arr[neg];
                neg++;
            }
        }
        return nums;
    }
}