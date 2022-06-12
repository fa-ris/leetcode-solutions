class Solution {
    public int largestUniqueNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1] && !map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else if (nums[i] != nums[i - 1] && !map.containsKey(nums[i])) {
                return nums[i];
            }
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        return -1;
    }
}