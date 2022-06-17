class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int j = 0;
        if (s.charAt(i) == ' ') {
            while (s.charAt(i) == ' ') {
                i--;
                j++;
            }
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        return s.length() - 1 - i - j;
    }
}