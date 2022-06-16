class Solution {
    public String reverseWords(String s) {
        String s1 = "";
        int j = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                if (i == s.length() - 1) {
                    j--;
                }
                while (j < i - last) {
                    s1 += Character.toString(s.charAt(i - 1 - j));
                    j++;
                }
                s1 += s.charAt(i);
                j = 0;
                last = i + 1;
            }
        }
        return s1.substring(0, s.length());
    }
}