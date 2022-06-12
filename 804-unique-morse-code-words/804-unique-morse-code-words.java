class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String temp = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                temp += morse[words[i].charAt(j) - 'a'];
            }
            if (!map.containsKey(temp)) {
                map.put(temp, 1);
            }
            temp = "";
        }
        return map.size();
    }
}