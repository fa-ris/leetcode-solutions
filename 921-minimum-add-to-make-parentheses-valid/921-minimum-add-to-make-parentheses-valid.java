class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int notClosed = 0;
        for (char c : s.toCharArray()) { // case where we find "("
            if (Character.toString(c).equals("(")) {
                open++;
            } else if (open > 0) { // case where we find an excess ")" and there are already opened ones
                open--;
            } else { // ")" this case
                notClosed++;
            }
        }
        return open + notClosed;
    }
}