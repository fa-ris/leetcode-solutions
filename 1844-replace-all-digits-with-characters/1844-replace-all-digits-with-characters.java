class Solution {
    public String replaceDigits(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                c[i] = (char)(Integer.parseInt(Character.toString(s.charAt(i))) + s.charAt(i - 1));
            }
        }
        return new String(c);
    }
}