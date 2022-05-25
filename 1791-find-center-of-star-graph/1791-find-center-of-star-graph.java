class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            if (map.containsKey(Integer.valueOf(edges[i][0]))) {
                return edges[i][0];
            } else if (map.containsKey(Integer.valueOf(edges[i][1]))) {
                return edges[i][1];
            } else {
                map.put(Integer.valueOf(edges[i][0]), 1);
                map.put(Integer.valueOf(edges[i][1]), 1);
            }
        }
        return -1;
    }
}