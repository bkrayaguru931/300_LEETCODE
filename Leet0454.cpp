//454. 4Sum II



class Solution {
public:
    int fourSumCount(vector<int>& A, vector<int>& B, vector<int>& C, vector<int>& D) {
         map<int,int> seen;
        
        for(auto x: A)
        {
            for(auto y: B)
            {
                seen[x+y]++;
            }
        }
        int ans=0;
        for(auto x: C)
        {
            for(auto y: D)
            {
                int s=x+y;
                if(seen.find(-s)!=seen.end()) ans+=seen[-s];
            }
        }
        
        return ans;
    }
};
