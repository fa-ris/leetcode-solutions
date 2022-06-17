class Solution {
    public int heightChecker(int[] heights) {
        if (heights.length == 1) {
            return 0;
        }
        int count = 0;
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}