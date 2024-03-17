class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.containsKey(target - nums[i])) {
                return new int[]{i, s.get(target - nums[i])};
            }
            s.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}