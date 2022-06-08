class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int splits = 0;
        while (l + r < s.length()) {
            splits++;
            if (s.charAt(l + r) == 'L') {
                l++;
            } else {
                r++;
            }
            while (l != r && l + r < s.length()) {
                if (s.charAt(l + r) == 'L') {
                    l++;
                } else {
                    r++;
                }
            }
        }
        return splits;
    }
}