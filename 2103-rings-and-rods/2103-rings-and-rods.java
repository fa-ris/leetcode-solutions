class Solution {
    public int countPoints(String rings) {
        Map<Integer, char[]> map = new HashMap<>();
        for (int i = 1; i < rings.length(); i += 2) {
            if (map.containsKey(Integer.valueOf(rings.charAt(i)) - 48)) {
                char[] temp = map.get(Integer.valueOf(rings.charAt(i)) - 48);
                if (rings.charAt(i - 1) == 'R') {
                    temp[0] = 'R';
                } else if (rings.charAt(i - 1) == 'G') {
                    temp[1] = 'G';
                } else {
                    temp[2] = 'B';
                }
                map.replace(Integer.valueOf(rings.charAt(i)) - 48, temp);
            } else {
                char[] temp = new char[3];
                if (rings.charAt(i - 1) == 'R') {
                    temp[0] = 'R';
                } else if (rings.charAt(i - 1) == 'G') {
                    temp[1] = 'G';
                } else {
                    temp[2] = 'B';
                }
                map.put(Integer.valueOf(rings.charAt(i)) - 48, temp);
            }
        }
        int count = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key)[0] == 'R' && map.get(key)[1] == 'G' && map.get(key)[2] == 'B') {
                    count++;
                }
        }
        return count;
    }
}