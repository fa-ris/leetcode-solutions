class Solution {
    public int numberOfMatches(int n) {
        if (n == 1) {
            return 0;
        }
        int num = 0;
        while (n > 2) {
            num += (n / 2);
            if (n % 2 == 1) {
                n = (n / 2) + 1;
            } else {
                n = n / 2;
            }
        }
        return ++num;
    }
}