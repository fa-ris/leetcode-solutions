class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num = (int) (num / 10);
        }
        Arrays.sort(arr);
        return 10 * (arr[0] + arr[1]) + (arr[2] + arr[3]);
    }
}