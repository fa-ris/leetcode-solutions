class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int answer = 10;
        int base = 9;
        for (int i = 2; i <= n && i <= 8; i++) {
            base *= (11 - i);
            answer += base;
        }
        return answer;
    }
}