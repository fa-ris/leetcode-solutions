/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        trav(root, 0);
        return sum;
    }
    private void trav(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level > max) {
            sum = 0;
            max = level;
        }
        if (level == max) {
            sum += root.val;
        }
        trav(root.left, level + 1);
        trav(root.right, level + 1);
    }
}