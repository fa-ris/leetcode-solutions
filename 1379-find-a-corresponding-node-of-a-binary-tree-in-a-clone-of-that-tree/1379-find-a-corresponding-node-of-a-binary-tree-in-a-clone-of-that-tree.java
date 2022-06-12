/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        List<TreeNode> list = new ArrayList<>();
        preOrder(cloned, list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).val == target.val) {
                return list.get(i);
            }
        }
        return cloned;
    }
    private void preOrder(final TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        preOrder(root.left, list);
        list.add(root);
        preOrder(root.right, list);
    }
}