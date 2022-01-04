// 713. Subarray Product Less Than K

//TC = O(n^2)
//SC = O(n)

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int i, j;
        int product;
        int n = nums.length;
 
        for (i = 0; i < n; i++) {
            if (nums[i] < k)
                count++;
 
            product = nums[i];
 
            for (j = i + 1; j < n; j++) {
                product = product * nums[j];
                if (product < k)
                    count++;
                else break;
            }
        }
 
        return count;
    }
}
