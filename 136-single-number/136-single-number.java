class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(Integer.valueOf(nums[i]))) {
                map.remove(Integer.valueOf(nums[i]));
            } else {
                map.put(Integer.valueOf(nums[i]), Integer.valueOf(1));
            }
        }
        for (Integer key : map.keySet()) {
            return key;
        }
        return -1;
    }
}