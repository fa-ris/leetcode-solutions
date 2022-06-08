class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 1; i < arr.length; i++) {
            first = encoded[i - 1];
            arr[i] = arr[i - 1] ^ first;
        }
        return arr;
    }
}