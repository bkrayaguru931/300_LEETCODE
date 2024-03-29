class Solution {
public:
    int longestSubarray(vector<int>& nums, int limit) {
        if(nums.size()==1)return 1;
        int i=0;
        int j=0;
        int result=0;
        int count=0;
        deque<int>max_dq;
        deque<int>min_dq;
        // Variable size window problem
        while(j<nums.size())
        {
            // Do pre-calculation
            
               // Calculatoin for max element in window
                while(!max_dq.empty()&&nums[max_dq.back()]<nums[j])
                    max_dq.pop_back();
                max_dq.push_back(j);
            
            // Calculation for min elemetn in window
               while(!min_dq.empty()&&nums[min_dq.back()]>nums[j])
                   min_dq.pop_back();
             min_dq.push_back(j);
            
            // Play with Condition
            
            
                while(abs(nums[j]-nums[min_dq.front()])>limit||abs(nums[j]-nums[max_dq.front()])>limit)
                {
                    // Remove the calculation for i
                    if(min_dq.front()==i)
                        min_dq.pop_front();
                    if(max_dq.front()==i)
                        max_dq.pop_front();
                    i++;
                }
            
            // store result
            result=max(result,j-i+1);
            j++;
            
        }
        return result;
    }
};

// Time Complexity: O(2*n)
// Space Complexity: O(2*n)
