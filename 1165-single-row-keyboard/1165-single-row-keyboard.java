class Solution {
    public int calculateTime(String keyboard, String word) {
        int sum = keyboard.indexOf(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            sum += Math.abs(keyboard.indexOf(word.charAt(i)) - keyboard.indexOf(word.charAt(i - 1)));
        }
        return sum;
    }
}