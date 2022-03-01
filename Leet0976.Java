//976. Largest Perimeter Triangle


class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 2; i--){
            float s = (float)(nums[i] + nums[i - 1] + nums[i - 2])/2;
            if (s > nums[i]){
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
            
        }
        return 0;
    }
}
