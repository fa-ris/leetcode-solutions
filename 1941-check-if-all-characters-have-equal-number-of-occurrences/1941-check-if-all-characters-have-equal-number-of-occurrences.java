class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int i = map.get(s.charAt(0));
        for (Character key : map.keySet()) {
            if (map.get(key) != i) {
                return false;
            }
        }
        return true;
    }
}