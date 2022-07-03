//16. 3Sum Closest



class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
	int minDiff = Integer.MAX_VALUE;
	int res = 0;
	
	for(int i = 0; i < nums.length - 2; i++) {
		int l = i + 1;
		int r = nums.length - 1;
		
		while(l < r) {
			int sum = nums[i] + nums[l] + nums[r];
			
			if(sum == target)
				return target;
			
			if(sum < target) {
				if(target - sum < minDiff) {
					minDiff = target - sum;
					res = sum;
				}
				
				l++;
			}
			
			else {
				if(sum - target < minDiff) {
					minDiff = sum - target;
					res = sum;
				}
				
				r--;
			}
		}
	}
	
	return res;
    }
}
