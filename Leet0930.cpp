930. Binary Subarrays With Sum





class Solution {
public:
    int numSubarraysWithSum(vector<int>& nums, int k) {
        int n=nums.size();
        int currSum=0, count=0;
        if(n==0) return 0;
        int i=0;
        unordered_map<int, int> mp;
        
        while( i<n){
            currSum+=nums[i];
            if(currSum==k)
            count+=1;
            if(mp.find(currSum-k) != mp.end())
                count+=mp[currSum-k];
            
            mp[currSum]++;
            i++;
        }
        return count;
    }
};
