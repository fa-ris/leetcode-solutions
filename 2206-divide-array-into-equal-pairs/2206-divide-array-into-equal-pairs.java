class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer value : map.values()) {
            if (value % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}