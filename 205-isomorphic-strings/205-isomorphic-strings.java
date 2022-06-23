class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                List<Integer> l = map.get(s.charAt(i));
                l.add(i);
                map.replace(s.charAt(i), l);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(s.charAt(i), l);
            }
        }
        Map<Character, List<Integer>> map1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (map1.containsKey(t.charAt(i))) {
                List<Integer> l = map1.get(t.charAt(i));
                l.add(i);
                map1.replace(t.charAt(i), l);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map1.put(t.charAt(i), l);
            }
        }
        for (List<Integer> value : map1.values()) {
            if (!map.containsValue(value)) {
                return false;
            }
        }
        return true;
    }
}