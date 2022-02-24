


//144. Binary Tree Preorder Traversal

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preOrderTree(ans, root);
        return ans;
        
    }
    public void preOrderTree(List<Integer> ans, TreeNode root) {
        if( root == null) return;
        ans.add(root.val);
        preOrderTree(ans, root.left);
        preOrderTree(ans, root.right);
    }
}
