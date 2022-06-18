class Solution {
    public int findComplement(int num) {
        char[] c = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0') {
                c[i] = '1';
            } else {
                c[i] = '0';
            }
        }
        return Integer.parseInt(new String(c), 2);
    }
}