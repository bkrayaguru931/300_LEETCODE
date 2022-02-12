//35. Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1, mid;
        
        while(low<=high){
            mid = low + (high-low)/2;
            
            if(nums[mid] == target) return mid;
            else if (nums[mid] < target) 
                low = mid+1;
            else 
                high = mid-1;
        }
        
        return low;
    }
}
