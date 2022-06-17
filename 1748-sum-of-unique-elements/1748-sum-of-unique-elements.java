class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int sum = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key).equals(1)) {
                sum += key;
            }
        }
        return sum;
    }
}