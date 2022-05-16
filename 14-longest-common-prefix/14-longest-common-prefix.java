class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int minIndex = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < strs[minIndex].length()) {
                minIndex = i;
            }
        }
        String ret = "";
        for (int i = 0; i < strs[minIndex].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    return ret;
                }
            }
            ret += strs[0].charAt(i);
        }
        return ret;
    }
}