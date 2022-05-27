class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        int start, e = 0;
        int digit = Integer.MIN_VALUE;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                e = i - 1;
                digit = Integer.valueOf(s.charAt(i));
            } else if (s.charAt(i) == ' ' || i == 0) {
                start = i;
                map.put(digit, s.substring(start, e + 1));
                System.out.println(s.substring(start, e + 1));
            }
        }
        s = new String("");
        SortedSet<Integer> keys = new TreeSet<>(map.keySet());
        for (Integer i : keys) {
            s += map.get(i).replace(" ", "") + " ";
        }
        return s.stripTrailing();
    }
}