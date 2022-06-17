class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        while (i < n && i < nums2.length && i < nums1.length) {
            nums1[i + m] = nums2[i];
            i++;
        }
        Arrays.sort(nums1);
    }
}