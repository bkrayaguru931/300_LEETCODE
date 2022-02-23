//198. House Robber


class Solution {
    public int rob(int[] nums) {
        int fast = 0;
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(fast + nums[i], slow);
            fast = slow;
            slow = temp;
        }
        return slow;
    }
}
