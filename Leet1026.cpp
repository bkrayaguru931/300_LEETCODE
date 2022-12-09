
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int ans = INT_MIN;
    void trav(TreeNode *root, int rootVal) {
        if(!root) return;
        
        ans = max(abs(root->val - rootVal), ans);
        
        trav(root->left, rootVal);
        trav(root->right, rootVal);
    }
    int maxAncestorDiff(TreeNode* root) {
        if(!root) return 0;
        int rootVal = root->val;
        trav(root->left, rootVal);
        trav(root->right, rootVal);
        
        maxAncestorDiff(root->left); maxAncestorDiff(root->right); 
        
        
        return ans;
    }
};
