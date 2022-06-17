class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) && !arr[i].equals(map.get(pattern.charAt(i)))) {
                return false;
            } else if (!map.containsKey(pattern.charAt(i)) && map.containsValue(arr[i])) {
                return false;
            } else if(!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), arr[i]);
            }
        }
        return true;
    }
}