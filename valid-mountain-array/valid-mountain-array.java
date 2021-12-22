class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            if (arr[s] < arr[s + 1]) {
                s++;
            } else if (arr[e] < arr[e - 1]) {
                e--;
            } else {
                break;
            }
        }
        return s != 0 && e != arr.length - 1 && s == e;
    }
}