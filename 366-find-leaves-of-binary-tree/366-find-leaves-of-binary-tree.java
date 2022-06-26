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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        while (root != null) {
            trav(root, l1);
            list.add(l1);
            l1 = new ArrayList<>();
            root = remove(root);
        }
        return list;
    }
    private void trav(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        trav(root.left, list);
        trav(root.right, list);
    }
    private TreeNode remove(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return null;
        }
        root.left = remove(root.left);
        root.right = remove(root.right);
        return root;
    }
}