class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < jewels.length(); i++) {
            map.put(Character.toString(jewels.charAt(i)), 1);
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (map.containsKey(Character.toString(stones.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}