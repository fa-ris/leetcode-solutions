class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].length() - sentences[i].replace(" ", "").length() + 1 > max) {
                max = sentences[i].length() - sentences[i].replace(" ", "").length() + 1;
            }
        }
        return max;
    }
}