//169. Majority Element





class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int majority,count=0;
        for (int num : nums) {
            if (!count) {
                majority = num;
            }
                       count += num == majority ? 1 : -1;

        }
        return majority;
    }
};
