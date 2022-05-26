class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = Integer.toBinaryString(i).replace("0", "").length();
        }
        return arr;
    }
}