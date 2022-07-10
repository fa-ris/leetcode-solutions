class Solution {
    public int minPathSum(int[][] grid) {
        int[][] arr = new int[grid.length][grid[0].length];
        arr[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            arr[i][0] = arr[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < grid[0].length; j++) {
            arr[0][j] = grid[0][j] + arr[0][j - 1];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                arr[i][j] = grid[i][j] + Math.min(arr[i - 1][j], arr[i][j - 1]);
            }
        }
        return arr[grid.length - 1][grid[grid.length - 1].length - 1];
    }
}