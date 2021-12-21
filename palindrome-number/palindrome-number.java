class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int i = 0;
        while (i < s.length() / 2) {
            char s1 = s.charAt(i);
            char s2 = s.charAt(s.length() - i - 1);
            if (!(s1 == s2)) return false;
            i++;
        }
        return true;
    }
}