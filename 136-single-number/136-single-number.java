class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(Integer.valueOf(nums[i]))) {
                map.replace(Integer.valueOf(nums[i]), Integer.valueOf(map.get(nums[i]) + 1));
            } else {
                map.put(Integer.valueOf(nums[i]), Integer.valueOf(1));
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key).equals(Integer.valueOf(1))) {
                return Integer.parseInt(Integer.toString(key));
            }
        }
        return -1;
    }
}