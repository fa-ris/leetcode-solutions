class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 && y != 0) {
            if ((x & 1) != (y & 1)) {
                count++;
            }
            x = x >> 1;
            y = y >> 1;
        }
        while (x > y) {
            if ((x & 1) == 1) {
                count++;
            }
            x = x >> 1;
        }
        while (y > x) {
            if ((y & 1) == 1) {
                count++;
            }
            y = y >> 1;
        }
        return count;
    }
}