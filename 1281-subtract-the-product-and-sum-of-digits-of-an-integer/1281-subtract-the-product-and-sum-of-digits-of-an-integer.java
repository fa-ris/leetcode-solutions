class Solution {
    public int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.valueOf(Character.toString(s.charAt(i)));
            product *= Integer.valueOf(Character.toString(s.charAt(i)));
        }
        return product - sum;
    }
}