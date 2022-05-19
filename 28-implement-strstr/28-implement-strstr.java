class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == "") {
            return 0;
        } else if (needle == null || haystack == null || haystack.length() < needle.length()) {
            return -1;
        } else if (haystack.length() == needle.length()) {
            return haystack.equals(needle) ? 0 : -1;
        }
        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                    if (j == needle.length() - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}