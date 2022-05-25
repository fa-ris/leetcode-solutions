class Solution {
    public boolean isArmstrong(int n) {
        int clone = n;
        int sum = 0;
        int k = Integer.toString(Integer.valueOf(n)).length();
        while (n > 0) {
            sum += Math.pow(n % 10, k);
            n = (int) (n / 10);
        }
        return sum == clone;
    }
}