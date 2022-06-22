class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ret = 0;
        for (int i = left; i <= right; i++) {
            switch (Integer.bitCount(i)) {
                case 2:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                case 17:
                case 19:
                case 23:
                case 29:
                    ret++;
            }
        }
        return ret;
    }
}