class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.replace(s.charAt(i), Integer.MAX_VALUE);
            } else {
                map.put(s.charAt(i), i);
            }
        }
        int index = Integer.MAX_VALUE;
        for (Character keys : map.keySet()) {
            index = Math.min(map.get(keys), index);
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }
}