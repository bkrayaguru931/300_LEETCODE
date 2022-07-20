//213. House Robber II



class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return nums[0];
        return Math.max(robIt(nums , 0 , len-1) , robIt(nums , 1 , len));
    }
    
    public int robIt(int[] nums , int ind , int end)
    {
        int prev = nums[ind];
        int prev2 = 0;
        int curI;
        
        for(int i = ind+1 ; i < end ; i++){
            int fs = nums[i];
            if(i>1)
                fs+=prev2;
            int ss = prev;
            
            curI = Math.max(fs , ss);
            
            prev2 = prev;
            prev = curI;
        }
        
        return prev;
    }

}
