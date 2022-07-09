//100. Same Tree


class Solution {
   public boolean isSame(TreeNode p,TreeNode q)
{
    if(p==null && q==null)return true;
    
    if(p==null && q!=null || p!=null && q==null)return false;
    if(p.val!=q.val)return false;
    
    boolean left= isSame(p.left,q.left);
    boolean right=isSame(p.right,q.right);
    if(!left||!right)return false;
    return true;
    
}
public boolean isSameTree(TreeNode p, TreeNode q) {
    
    return isSame(p,q);
}
}
