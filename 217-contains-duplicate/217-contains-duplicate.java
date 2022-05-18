import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(Integer.valueOf(nums[i])) != null) {
                return true;
            } else {
                hm.put(Integer.valueOf(nums[i]), Integer.valueOf(1));
            }
        }
        return false;
    }
}