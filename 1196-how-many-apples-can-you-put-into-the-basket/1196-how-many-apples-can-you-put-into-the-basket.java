class Solution {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int i = 0;
        int w = 0;
        while (i < weight.length) {
            if (w + weight[i] <= 5000) {
                w += weight[i];
            } else {
                break;
            }
            i++;
        }
        return i;
    }
}