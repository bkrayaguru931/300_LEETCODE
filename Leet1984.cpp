//1984. Minimum Difference Between Highest and Lowest of K Scores
class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
         if(k==1)
            return 0;
        int n=nums.size();
        sort(nums.begin(),nums.end());
        int minDiff=nums[n-1]-nums[0];
        int i=0,j=i+k-1;
        while(j<n)
        {
            minDiff=min(minDiff,nums[j]-nums[i]);
            j++;
            i++;
        }
        
        
        return minDiff;
    }
};
