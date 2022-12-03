//560. Subarray Sum Equals K




class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
       int n= nums.size(), currSum=0, count=0;
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
