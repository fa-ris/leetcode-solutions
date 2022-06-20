class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String s = "";
        int neg = 1;
        if (num < 0) {
            neg = -1;
            num *= neg;
        }
        while (num != 0) {
            s += Integer.toString(num % 7);
            num = (int) (num / 7);
        }
        if (neg == -1) {
            s += Character.toString('-');
        }
        return new StringBuffer(s).reverse().toString();
    }
}