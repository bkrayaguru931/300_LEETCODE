//80. Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
      
      // if (nums == null) {
      //     throw new IllegalArgumentException("Input array is null");
      // }
      
        if (nums.length <= 2) {
            return nums.length;
        }
        int k = 1;
        for(int i = 2;i < nums.length; i++){
            if(nums[i]!=nums[k-1])
                nums[++k]=nums[i];
        }
        return k+1;
        
        
        
        
        
    }
}
