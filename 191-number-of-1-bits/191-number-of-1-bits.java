public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            int temp = 1;
            temp = temp & n;
            if (temp == 1) {
                ret++;
            }
            n = n >> 1;
        }
        return ret;
    }
}