class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            l.add(0, 1);
            for (int j = 1; j < l.size() - 1; j++) {
                l.set(j, l.get(j) + l.get(j + 1));
            }
            list.add(new ArrayList<>(l));
        }
        return list;
    }
}