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
    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTreeH(root, root.val);
    }
    private boolean isUnivalTreeH(TreeNode root, int val) {
        if (root == null) {
            return true;
        } else if (root.val != val) {
            return false;
        }
        return isUnivalTreeH(root.left, val) && isUnivalTreeH(root.right, val);
    }
}