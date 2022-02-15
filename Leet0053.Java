//53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int n = nums.length;
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j <= i; j++) {
//                 int sum = 0;
//                 for(int k = j; k <= i; k++) {
//                     sum += nums[k];
//                 }
//                 max = Math.max(max, sum);
//             }
//         }
        
//         return max;
        
        
         int cur = nums[0];
        int total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (cur < 0) {
                cur = nums[i];
            } else {
                cur += nums[i];
            }
            if (cur > total) {
                total = cur;
            }
        }
        return total;
    }
}
