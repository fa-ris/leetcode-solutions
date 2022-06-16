class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        int k = 0;
        int j = 0;
        boolean s = false;
        for (int i = 0; i < words.length - 1; i++) {
            while (k < words[i].length() && j < words[i + 1].length()) {
                if (map.get(words[i].charAt(k)).equals(map.get(words[i + 1].charAt(j)))) {
                    k++;
                    j++;
                } else if (map.get(words[i].charAt(k)).compareTo(map.get(words[i + 1].charAt(j))) < 0) {
                    s = true;
                    break;
                } else {
                    return false;
                }
            }
            if (words[i].length() > words[i + 1].length() && !s) {
                    return false;
            }
            j = 0;
            k = 0;
        }
        return true;
    }
}