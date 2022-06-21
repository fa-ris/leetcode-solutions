class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ret = new int[arr.length];
        int max = arr[arr.length - 1];
        ret[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (i == arr.length - 2) {
                ret[i] = arr[arr.length - 1];
            } else {
                ret[i] = Math.max(arr[i + 1], ret[i + 1]);
            }
        }
        return ret;
    }
}