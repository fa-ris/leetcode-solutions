public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        char[] c = (Integer.toBinaryString(n)).toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            stack.push(c[i]);
        }
        String s = "";
        while (!stack.isEmpty()) {
            s += Character.toString(stack.pop());
        }
        for (int i = 0; i < 32 - c.length; i++) {
            s += "0";
        }
        System.out.println(s);
        long sum = 0l;
        for (int i = 0; i < 32; i++) {
            if (s.charAt(i) == '1') {
                sum += Math.pow(2, 31 - i);
            }
        }
        return (int) sum;
    }
}