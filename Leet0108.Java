//108. Convert Sorted Array to Binary Search Tree


class Solution {
    private TreeNode sortedArrayToBST(int[] nums, int startIndex, int endIndex) {
        
        if(startIndex == endIndex)
            return new TreeNode( nums[startIndex] );
            
        if(startIndex + 1 == endIndex){
            TreeNode nodeLocalRoot = new TreeNode( nums[endIndex] );
            TreeNode nodeLocalChild = new TreeNode( nums[startIndex] );
            nodeLocalRoot.left = nodeLocalChild;
            return nodeLocalRoot;
        }
        
        int length = endIndex - startIndex + 1;
        int midIndex = startIndex;
        if(length%2 != 0){
            // Odd length 
            midIndex = startIndex + (endIndex - startIndex)/2;
        }
        else{
            midIndex = startIndex + (endIndex - startIndex)/2  + 1;
        }
        TreeNode nodeLocalRoot = new TreeNode( nums[midIndex] );
        nodeLocalRoot.left =  sortedArrayToBST( nums,  startIndex,  midIndex-1);
        nodeLocalRoot.right = sortedArrayToBST( nums,  midIndex+1,  endIndex  );
        
        return nodeLocalRoot;
        
        
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST( nums, 0, nums.length-1);
    }
}
