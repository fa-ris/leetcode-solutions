class Solution {
    public int minBitFlips(int start, int goal) {
        char[] s = Integer.toBinaryString(start).toCharArray();
        char[] g = Integer.toBinaryString(goal).toCharArray();
        int i = s.length - 1;
        int j = g.length - 1;
        int count = 0;
        while (i >= 0 && j >= 0) {
            if (s[i] != g[j]) {
                count++;
            }
            i--;
            j--;
        }
        while (i >= 0) {
            if (s[i] == '1') {
                count++;
            }
            i--;
        }
        while (j >= 0) {
            if (g[j] == '1') {
                count++;
            }
            j--;
        }
        return count;
    }
}