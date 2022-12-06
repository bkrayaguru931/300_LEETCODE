//594. Longest Harmonious Subsequence




class Solution {
public:
   int findLHS(vector<int>& nums) {
        
        int maxLen = 0;
        unordered_map<int, int> mp;
        for(int i : nums)
            mp[i]++;
        
        for(auto i : mp)
        {
            if(mp.find(i.first + 1) != mp.end())
                maxLen = max(maxLen, i.second+mp[i.first+1]);
        }
        
        return maxLen;
    }
};
