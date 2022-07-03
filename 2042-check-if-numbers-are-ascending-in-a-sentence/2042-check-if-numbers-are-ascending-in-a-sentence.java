class Solution {
    public boolean areNumbersAscending(String s) {
        char[] c = s.toCharArray();
        int j = Integer.MIN_VALUE;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int comp = Integer.parseInt(Character.toString(c[i]));
                if (i < c.length - 1 && Character.isDigit(c[i + 1])) {
                    comp = comp * 10 + Integer.parseInt(Character.toString(c[i + 1]));
                    i++;
                }
                if (i < c.length - 2 && Character.isDigit(c[i + 2]) && Character.isDigit(c[i + 1])) {
                    comp = comp * 10 + Integer.parseInt(Character.toString(c[i + 2]));
                    i++;
                }
                if ((comp) <= j) {
                    return false;
                }
                j = comp;
            }
        }
        return true;
    }
}