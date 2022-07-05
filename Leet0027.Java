//27. Remove Element



class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        int n = nums.length;
        while(fast < n){
            if(nums[fast] != val){
                nums[slow++] = nums[fast];
            }
            fast ++;
        }
        return slow;
    }
}
