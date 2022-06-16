class Solution {
    public int reverse(int x) {
        char[] arr = Integer.toString(x).toCharArray();
        if (x < 0) {
            arr = Integer.toString(x).substring(1, Integer.toString(x).length()).toCharArray();
        }
        int i = 0;
        int j = arr.length - 1;
        char temp = ' ';
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int result = 0;
        try {
            result = Integer.parseInt(new String(arr));
        } catch (NumberFormatException e) {
            return 0;
        }
        return x < 0 ? -1 * Integer.parseInt(new String(arr)) : Integer.parseInt(new String(arr));
    }
}