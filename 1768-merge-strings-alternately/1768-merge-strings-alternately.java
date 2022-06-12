class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            if ((i + j) % 2 == 0) {
                s += word1.charAt(i);
                i++;
            } else {
                s += word2.charAt(j);
                j++;
            }
        }
        while (i < word1.length()) {
            s += word1.charAt(i);
            i++;
        }
        while (j < word2.length()) {
            s += word2.charAt(j);
            j++;
        }
        return s;
    }
}