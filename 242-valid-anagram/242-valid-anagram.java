import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<String, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(Character.toString(c))) {
                map.replace(Character.toString(c), map.get(Character.toString(c)) + 1);
            } else {
                map.put(Character.toString(c), 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(Character.toString(c))) {
                if (map.get(Character.toString(c)) <= 0) {
                    return false;
                }
                map.replace(Character.toString(c), map.get(Character.toString(c)) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}