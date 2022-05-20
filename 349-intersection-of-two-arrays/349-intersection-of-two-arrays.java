class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.get(nums1[i]) == null) {
                map.put(nums1[i], 1);
            }
        }
        int[] arr = new int[nums1.length];
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null) {
                arr[j] = nums2[i];
                j++;
                map.remove(nums2[i]);
            }
        }
        int[] temp = new int[j];
        for (int k = 0; k < j; k++) {
            temp[k] = arr[k];
        }
        return temp;
    }
}