class Solution {
    public int findFinalValue(int[] nums, int original) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        while (map.containsKey(original)) {
            original *= 2;
        }
        return original;
    }
}