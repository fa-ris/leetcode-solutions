class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> big = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        String s = "";
        big.add(new ArrayList<>());
        for (int i = 1; i < (int) Math.pow(2, nums.length); i++) {
            list = new ArrayList<>();
            s = Integer.toBinaryString(i);
            int k = 0;
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == '1') {
                    list.add(nums[nums.length - 1 - k]);
                }
                k++;
            }
            big.add(list);
        }
        return big;
    }
}