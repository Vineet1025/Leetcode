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
      private List<TreeNode> inOrder = new ArrayList<>();
    private void inOrderTree(TreeNode root) {
        if (root == null) return;
        inOrderTree(root.left);
        inOrder.add(root);
        inOrderTree(root.right);
    }

      private TreeNode balanced(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = inOrder.get(mid);
        root.left = balanced(start, mid - 1);
        root.right = balanced(mid + 1, end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
         inOrderTree(root);
        return balanced(0, inOrder.size() - 1);  
    }
}