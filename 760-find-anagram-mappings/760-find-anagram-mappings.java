class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(Integer.valueOf(nums2[i]), i);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums2[i] = map.get(Integer.valueOf(nums1[i]));
        }
        return nums2;
    }
}