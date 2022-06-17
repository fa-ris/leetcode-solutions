class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.toBinaryString(n).length() - Integer.toBinaryString(n).replace("1", "").length() == 1;
    }
}