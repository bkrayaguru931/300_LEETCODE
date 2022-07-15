//45. Jump Game ||

class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length && j<=i+nums[i]; j++) {
                if(dp[j]==-1)
                    dp[j] = 1+dp[i];
                else
                    dp[j] = Math.min(dp[j], 1+dp[i]);
            }
        }
        
        return dp[nums.length-1];
    }
}
