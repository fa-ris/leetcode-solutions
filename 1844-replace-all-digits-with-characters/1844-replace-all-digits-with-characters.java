class Solution {
    public String replaceDigits(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                r += Character.toString(s.charAt(i));
            } else {
                r += Character.toString(Integer.parseInt(Character.toString(s.charAt(i))) + s.charAt(i - 1));
            }
        }
        return r;
    }
}