//230. Kth Smallest Element in a BST




class Solution {
        private int counter=0;
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null) return -1;
        int ans = kthSmallest(root.left,k);
        if(ans!=-1) return ans; // if we got the ans already don't traverse to right
        counter++;
        if(counter==k) return root.val;
        ans = kthSmallest(root.right,k);
        return ans;
    }
}
