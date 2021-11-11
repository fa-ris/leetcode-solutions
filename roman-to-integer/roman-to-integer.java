class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> temp = new HashMap<>();
        
        temp.put('I', 1);
        temp.put('V', 5);
        temp.put('X', 10);
        temp.put('L', 50);
        temp.put('C', 100);
        temp.put('D', 500);
        temp.put('M', 1000);
        
        int num = temp.get(s.charAt(s.length() - 1));
        
        for (int i = s.length() - 2; i >= 0; i--) {
            if (temp.get(s.charAt(i)) >= temp.get(s.charAt(i + 1))) {
                num += temp.get(s.charAt(i));
            } else { // special cases
                num -= temp.get(s.charAt(i));
            }
        }
        
        return num;
    }
}