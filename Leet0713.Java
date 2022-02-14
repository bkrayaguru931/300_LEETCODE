//713. Subarray Product Less Than K

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int p = 1;
        int count = 0;
        while (end < nums.length){
            p*=nums[end];
        }
        while(start < nums.length && p>=k){
            p = p/nums[start];
            start++;
        }
        if(p<k){
            count+=(end-start)+1;
        }
        end++;
        return count;
    }
}
