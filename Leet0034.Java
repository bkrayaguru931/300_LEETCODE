//34. Find First and Last Position of Element in Sorted Array


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] rez = {-1, -1};
        if (nums == null || nums.length == 0){
            return rez;
        }
        if (nums.length == 1 && nums[0] != target){
            return rez;
        } else if (nums.length == 1 && nums[0] == target) {
            rez[0] = 0;
            rez[1] = 0;
            return rez;
        }
        //find firs occur
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right){
            int mid = left + (right - left)/2;
            if (nums[mid] < target){
                left = mid;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target){
            rez[0] = left;
        } else if (nums[right] == target){
            rez[0] = right;
            }
        if (nums[left] == target){
            left = 0;
        } else if (rez[0] != -1) {
            left = rez[0];
            }
       
        right = nums.length - 1;
        if (nums[right] == nums[left] && nums[left] == target){
            rez[1] = right;
            } else {
                while (left + 1 < right) {
                    int mid = left + (right - left) / 2;
                    if (nums[mid] <= target) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
                if (nums[left] == target) {
                    rez[1] = left;
                } else if (nums[right] == target) {
                    rez[1] = right;
                }
            }
        return rez;
    }
}
