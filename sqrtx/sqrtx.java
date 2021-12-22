class Solution {
    public int mySqrt(int x) {
        if (x == 1) return x;
        int l = 1;
        int r = x;
        int ans = 0;
        while (l <= r) {
            int mid = (int) (l + r) / 2;
            if (mid * mid == x) return mid;
            if (mid >= x / mid) {
                r = mid - 1;
            }
            if (mid <= x / mid) {
                l = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}