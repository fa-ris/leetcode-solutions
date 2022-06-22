class Solution {
    public int smallestCommonElement(int[][] mat) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (map.containsKey(mat[i][j])) {
                    map.replace(mat[i][j], map.get(mat[i][j]) + 1);
                } else {
                    map.put(mat[i][j], 1);
                }
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == mat.length) {
                System.out.println(key);
                return key;
            }
        }
        return -1;
    }
}