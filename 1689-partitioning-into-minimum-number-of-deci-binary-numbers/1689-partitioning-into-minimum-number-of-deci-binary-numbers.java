class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length(); i++) {
            max = Math.max(max, Character.getNumericValue(n.charAt(i)));
            if (max == 9) {
                return max;
            }
        }
        return max;
    }
}