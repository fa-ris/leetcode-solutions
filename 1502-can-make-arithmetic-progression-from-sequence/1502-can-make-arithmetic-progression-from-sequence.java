class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2) {
            return true;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] - arr[i + 1] != arr[i + 1] - arr[i + 2]) {
                return false;
            }
        }
        return true;
    }
}